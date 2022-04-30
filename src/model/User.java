package model;

import dao.UserDAO;

public class User {
	
	private int id;
	private String name;
	private String lastname;
	private String cnh;
	
	protected User() {}
	
	protected User(String name, String lastname, String cnh) {
		this.name = name;
		this.lastname = lastname;
		this.cnh = cnh;
	}
	
	public void register() {
		UserDAO.registerUser(this);
	}
	
	public int setId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getCnh() {
		return cnh;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
