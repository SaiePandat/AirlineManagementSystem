package com.mgmt.AirlineSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminHome {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.SEQUENCE)
 private int id;
 private String Username;
 private String Password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Admin [id=" + id + ", Username=" + Username + ", Password=" + Password + "]";
}
public AdminHome(int id, String username, String password) {
	super();
	this.id = id;
	Username = username;
	Password = password;
}
public AdminHome() {
	super();
	// TODO Auto-generated constructor stub
}
 
 



}
