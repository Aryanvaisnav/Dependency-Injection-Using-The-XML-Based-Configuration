package com.jsp.employee.settergetterinjection;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Employee() {
		System.out.println("Object is created using spring");
		
	}
	
	public void employeeDetails() {
		System.out.println("Id of the employee: " + id);
		System.out.println("Name of the employee: " + name);
		System.out.println("Email of the employee: " + email);
	}

}
