package com.bobopop787;

import java.awt.Color;
import java.util.Calendar;

public class Motorcycle {
	private String modelId;
	private Color color;
	private int year;
	private double mileage;
	private double speed;
	private double price;
	private double maxSpeed;
	
	public Motorcycle() {
		modelId = "Default";
		color = Color.BLACK;
		year = Calendar.getInstance().get(Calendar.YEAR);
		mileage = 0;
		speed = 0;
		price = 50000;
		maxSpeed = 100;
	}
	
	public Motorcycle(String modelId, Color color, int year, double mileage, double maxSpeed, double price) {
		this.modelId = modelId;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
		this.speed = 0;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
}
