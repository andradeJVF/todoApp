package com.capgemini.todoapp.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.todoapp.model.Project;
import com.capgemini.todoapp.util.ConnectionFactory;

public class ProjectController {

	public void save(Project project) {

		String sql = "INSERT INTO projects (name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, project.getName());
			statement.setString(2, project.getDescription());
			statement.setDate(3, new Date(project.getCreatedAt().getTime()));
			statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
			statement.execute();

		} catch (Exception e) {
			throw new RuntimeException("Erro ao criar Projeto" + e.getMessage(), e);

		} finally {
			ConnectionFactory.closeConnection(conn, statement);

		}
	}

	public void update(Project project) {

		String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, project.getName());
			statement.setString(2, project.getDescription());
			statement.setDate(3, new Date(project.getCreatedAt().getTime()));
			statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
			statement.setInt(5,  project.getId());
			statement.execute();

		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar a Projeto" + e.getMessage(), e);

		} finally {
			ConnectionFactory.closeConnection(conn, statement);
		}
	}

	public void removeById(int idProject) throws SQLException {

		String sql = "DELETE FROM projects WHERE id = ?";

		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

			statement.setInt(1, idProject);
			statement.execute();

		} catch (Exception e) {
			throw new RuntimeException("Erro ao deletar o Projeto" + e.getMessage(), e);

		} finally {
			ConnectionFactory.closeConnection(conn, statement);
		}
	}

	public List<Project> getAll() {

		String sql = "SELECT * FROM projects";

		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		List<Project> projects = new ArrayList<Project>();

		try {
			conn = ConnectionFactory.getConnection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Project project = new Project();
				project.setId(resultSet.getInt("id"));
				project.setName(resultSet.getString("name"));
				project.setDescription(resultSet.getString("description"));
				project.setCreatedAt(resultSet.getDate("createdAt"));
				project.setUpdatedAt(resultSet.getDate("updatedAt"));

				projects.add(project);
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao listar os projetos" + e.getMessage(), e);

		} finally {
			ConnectionFactory.closeConnection(conn, statement, resultSet);
		}

		return projects;
	}
}