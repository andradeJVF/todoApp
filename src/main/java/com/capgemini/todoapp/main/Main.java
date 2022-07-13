package com.capgemini.todoapp.main;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.todoapp.controller.ProjectController;
import com.capgemini.todoapp.model.Project;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ProjectController projectController = new ProjectController();
		
		Project project = new Project();
		//project.setName("Projeto Teste 2");
		//project.setDescription("Este é um projeto criado para fins de teste");
		//projectController.save(project);
		
		// project.setId(17);
		// project.setName("Novo nome do projeto teste");
		// projectController.update(project);
		
		List<Project> projects = projectController.getAll();
		System.out.println("Total de projetos = "+ projects.size());
		
		// projectController.removeById(16);
	}
	

}
