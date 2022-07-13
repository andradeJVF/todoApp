package com.capgemini.todoapp.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.todoapp.model.Task;
import com.capgemini.todoapp.util.ConnectionFactory;

public class TaskController {

    public void save(Task task) {

        String sql = "INSERT INTO tasks (name, description, status, notes, deadline, createdAt, updatedAt, project_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setBoolean(3, task.isStatus());
            statement.setString(4, task.getNotes());
            statement.setDate(5, new Date(task.getDeadline().getTime()));
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            statement.setDate(7, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(8, task.getProject_id());
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar tarefa" + e.getMessage(), e);

        } finally {
            ConnectionFactory.closeConnection(conn, statement);

        }
    }

    public void update(Task task) {

        String sql = "UPDATE tasks SET name = ?, description = ?, status = ?, notes = ?, deadline = ?, createdAt = ?, updatedAt = ?, project_id = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setBoolean(3, task.isStatus());
            statement.setString(4, task.getNotes());
            statement.setDate(5, new Date(task.getDeadline().getTime()));
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            statement.setDate(7, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(8, task.getProject_id());
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + e.getMessage(), e);

        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void removeById(int taskId) throws SQLException {

        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = (PreparedStatement) conn.prepareStatement(sql);

            // substitui o ? pelo id correspondente
            statement.setInt(1, taskId);
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);

        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public List<Task> getAll(int project_id) {

        String sql = "SELECT * FROM tasks WHERE project_id = ?";

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        //Lista de tarefas que é devolvida quando o método é chamado
        List<Task> tasks = new ArrayList<Task>();

        try {
            conn = ConnectionFactory.getConnection();
            statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setInt(1, project_id);
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setStatus(resultSet.getBoolean("status"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                task.setProject_id(resultSet.getInt("project_id"));

                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar tarefas" + e.getMessage(), e);

        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        //retornando a lista de tarefas
        return tasks;
    }
}