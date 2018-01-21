package com.viraj.Inheritance;

public class Cat extends Animal {

	private final int numberOflegs;
	private boolean canHuntOtherAnimals;

	public Cat(String name, String color, int amountOfSpeed, int amountOfPower, int numberOflegs, boolean canHuntOtherAnimals) {
		super(name, color, amountOfSpeed, amountOfPower);
		this.numberOflegs = numberOflegs;
		this.canHuntOtherAnimals = canHuntOtherAnimals;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format(" | %s: %d | %s: %b", "Number of Legs ", numberOflegs, 
				"Can hunt other animals", canHuntOtherAnimals) + "Animal Value: " + evaluateAnimalValue();
	}

	// Get CanHuntOtherAnimals

	public boolean getCanHuntOtherAnimals() {
		return canHuntOtherAnimals;
	}

	// Set CanHuntOtherAnimals

	public void setCanHuntOtherAnimals(boolean canHuntOtherAnimals) {
		this.canHuntOtherAnimals = canHuntOtherAnimals;
	}

	// Get NumberOfLegs

	public int getNumberOflegs() {
		return numberOflegs;
	}

	// Output some values to the screen
	
	public String outputSomeValuesToTheString() {
		return "Name : " + name + " | Color : " + color + " | Amount of Speed : " + amountOfSpeed +
				" | Amount of Power : " + amountOfPower;
	}



}
