package com.Vinay.CRM12.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeometryBoxSale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long geometryId;
	private String shape;
	private String colour;
	private String brand;
	private Double cost;
	
	public Long getGeometryId() {
		return geometryId;
	}
	public void setGeometryId(Long geometryId) {
		this.geometryId = geometryId;
	}
		
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public GeometryBoxSale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GeometryBoxSale(String shape, String colour, String brand, Double cost) {
		super();
//		this.geometryId = geometryId;
		this.shape= shape;
		this.colour = colour;
		this.brand = brand;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "GeometryBoxSale [geometryId=" + geometryId + ", Shape=" + shape + ", colour=" + colour + ", brand="
				+ brand + ", cost=" + cost + "]";
	}
}
