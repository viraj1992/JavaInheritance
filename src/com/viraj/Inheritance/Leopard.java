package com.viraj.Inheritance;

public class Leopard extends Cat{

	private String claws;

	// Created Constructor

	public Leopard(String name, String color, int amountOfSpeed, int amountOfPower, 
			int numberOflegs, boolean canHuntOtherAnimals, String claws) {
		super(name, color, amountOfSpeed, amountOfPower, numberOflegs, canHuntOtherAnimals);
		this.claws = claws;
	}

	// get claws class
	
	public String getClaws() {
		return claws;
	}
	
	// set claws class

	public void setClaws(String claws) {
		this.claws = claws;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" | %s : %s", "Claws", claws);
	}




}
