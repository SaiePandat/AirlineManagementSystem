package com.mgmt.AirlineSystem.entity;

import java.io.File;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String no_of_travelers;
    private String mail;
    @Lob
    private File adhar_card;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNo_of_travelers() {
		return no_of_travelers;
	}
	public void setNo_of_travelers(String no_of_travelers) {
		this.no_of_travelers = no_of_travelers;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public File getAdhar_card() {
		return adhar_card;
	}
	public void setAdhar_card(File adhar_card) {
		this.adhar_card = adhar_card;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", no_of_travelers=" + no_of_travelers + ", mail=" + mail + ", adhar_card="
				+ adhar_card + "]";
	}
	public Booking(int id, String firstName, String lastName, int age, String gender, String no_of_travelers,
			String mail, File adhar_card) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.no_of_travelers = no_of_travelers;
		this.mail = mail;
		this.adhar_card = adhar_card;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
	
	
    
}