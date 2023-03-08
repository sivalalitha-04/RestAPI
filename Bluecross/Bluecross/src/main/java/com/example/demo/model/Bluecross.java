package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bluecross {
	@Id
	@GeneratedValue
	private int id;
	private String animal;
	private String agePrediction;
	private String area;
	private String city;
	private String injuredType;
	private String treatment;
	private String cured;
	private int price;
	private String adopted;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getAgePrediction() {
		return agePrediction;
	}
	public void setAgePrediction(String agePrediction) {
		this.agePrediction = agePrediction;
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
	public String getInjuredType() {
		return injuredType;
	}
	public void setInjuredType(String injuredType) {
		this.injuredType = injuredType;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getCured() {
		return cured;
	}
	public void setCured(String cured) {
		this.cured = cured;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAdopted() {
		return adopted;
	}
	public void setAdopted(String adopted) {
		this.adopted = adopted;
	}
	@Override
	public String toString() {
		return "Bluecross [id=" + id + ", animal=" + animal + ", agePrediction=" + agePrediction + ", area=" + area
				+ ", city=" + city + ", injuredType=" + injuredType + ", treatement="
				+ treatment + ", cured=" + cured + ", price=" + price + ", adopted=" + adopted + "]";
	}

}
