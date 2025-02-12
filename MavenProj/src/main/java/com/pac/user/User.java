package com.pac.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity		// yeh class as a entity kaam karega
@Table(name = "users")   // Mapping the class to a table named 'users'
public class User {
	
	@Id  //Marks userName as the primary key.
	@Column(name = "userName") // userName column acts as the Primary Key
	String user;
	@Column(name = "password") //Maps the pass variable to the password column.
	String pass;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
