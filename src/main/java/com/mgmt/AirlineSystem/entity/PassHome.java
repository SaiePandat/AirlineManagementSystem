package com.mgmt.AirlineSystem.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PassHome {
	@Id
	private int id;
	private String username;
	private String password;
	private LocalDateTime lastLogin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "PassHome [id=" + id + ", username=" + username + ", password=" + password + ", lastLogin=" + lastLogin
				+ "]";
	}
	public PassHome(int id, String username, String password, LocalDateTime lastLogin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.lastLogin = lastLogin;
	}
	public PassHome() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
