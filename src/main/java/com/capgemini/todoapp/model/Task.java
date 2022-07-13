package com.capgemini.todoapp.model;

import java.util.Date;

public class Task {

	private int id;
	private String name;
	private String description;
	private boolean status;
	private String notes;
	private Date deadline;
	private Date createdAt;
	private Date updatedAt;
	private int project_id;
	
	public Task(int id, String name, String description, boolean status, String notes, Date deadline, Date createdAt,
			Date updatedAt, int project_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.notes = notes;
		this.deadline = deadline;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.project_id = project_id;
	}

	public Task(){
		this.createdAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + ", notes="
				+ notes + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", project_id=" + project_id + "]";
	}
	
}