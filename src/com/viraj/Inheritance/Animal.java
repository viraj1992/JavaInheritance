package com.viraj.Inheritance;

public class Animal extends Object{

	// Instance Variables

	private final String name;
	private final String color;
	private int amountOfSpeed;
	private int amountOfPower;

	public Animal(String name, String color, int amountOfSpeed, int amountOfPower) {
		this.name = name;
		this.color = color;
		this.amountOfSpeed = amountOfSpeed;
		this.amountOfPower = amountOfPower;

	}

	// set amountOfSpeed

	public void setAmountOfSpeed(int amountOfSpeed) {
		this.amountOfSpeed = amountOfSpeed;
	}

	// get amountOfSpeed

	public int getAmountOfSpeed() {
		return amountOfSpeed;
	}

	// set amountOfPower

	public void setAmountOfPower(int amountOfPower) {
		this.amountOfPower = amountOfPower;
	}

	// get amountOfPower

	public int getAmountOfPower() {
		return amountOfPower;
	}

	// get name

	public String getName() {
		return name;
	}

	// get color 

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s | %s:%s | %s: %d | %s: %d", "Name", name, "Color", 
				color, "Amount of Speed ", amountOfSpeed, "Amount of Power ", amountOfPower);
	}
	
	// Evaluate animal value
	
	public int evaluateAnimalValue() {
		int result = amountOfSpeed * amountOfPower;
		return result;
	}




}
