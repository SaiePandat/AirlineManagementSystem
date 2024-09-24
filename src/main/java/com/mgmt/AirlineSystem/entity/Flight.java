package com.mgmt.AirlineSystem.entity;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String airplane;
    private String departureAirport;
    private String arrivalAirport;
    private String flightStatus;
    private Date departureTime;
    private Date arrivalTime;
    private int economyFare;
    private int businessFare;
    private int firstClassFare;
    
    private int number_of_seats;
    
public int getNumber_of_seats() {
		return number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	    private int number_of_passengers;
    
	public int getNumber_of_passengers() {
		return number_of_passengers;
	}
	public void setNumber_of_passengers(int number_of_passengers) {
		this.number_of_passengers = number_of_passengers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirplane() {
		return airplane;
	}
	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getEconomyFare() {
		return economyFare;
	}
	public void setEconomyFare(int economyFare) {
		this.economyFare = economyFare;
	}
	public int getBusinessFare() {
		return businessFare;
	}
	public void setBusinessFare(int businessFare) {
		this.businessFare = businessFare;
	}
	public int getFirstClassFare() {
		return firstClassFare;
	}
	public void setFirstClassFare(int firstClassFare) {
		this.firstClassFare = firstClassFare;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", airplane=" + airplane + ", departureAirport=" + departureAirport
				+ ", arrivalAirport=" + arrivalAirport + ", flightStatus=" + flightStatus + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", economyFare=" + economyFare + ", businessFare="
				+ businessFare + ", firstClassFare=" + firstClassFare + "]";
	}
	public Flight(int id, String airplane, String departureAirport, String arrivalAirport, String flightStatus,
			Date departureTime, Date arrivalTime, int economyFare, int businessFare, int firstClassFare) {
		super();
		this.id = id;
		this.airplane = airplane;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.flightStatus = flightStatus;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.economyFare = economyFare;
		this.businessFare = businessFare;
		this.firstClassFare = firstClassFare;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

  
	
	
}

