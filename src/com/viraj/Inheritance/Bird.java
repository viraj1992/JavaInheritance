package com.viraj.Inheritance;

public class Bird extends Animal{

	private final boolean canFly = true;
	private int numberOfWings;

	public Bird(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfWings) {
		super(name, color, amountOfSpeed, amountOfPower);
		this.numberOfWings = numberOfWings;
	}

	// get numberOfWings

	public int getnumberOfWings() {
		return numberOfWings;
	}

	// set numberOfWings

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}
	
	// override toSring method

	@Override
	public String toString() {
		return super.toString() + String.format(" | %s : %b | %s : %s", "Can Fly", canFly, "Number of Wings", numberOfWings);
	}

}
