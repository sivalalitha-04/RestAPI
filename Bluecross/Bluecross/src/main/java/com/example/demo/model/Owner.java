package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Owner {
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private long mobileNumber;
	private String area;
	private String city;
	private int pincode;
	private String profession;
	private String adoptedAnimal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAdoptedAnimal() {
		return adoptedAnimal;
	}
	public void setAdoptedAnimal(String adoptedAnimal) {
		this.adoptedAnimal = adoptedAnimal;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", profession=" + profession + ", adoptedAnimal=" + adoptedAnimal + "]";
	}
	
}
