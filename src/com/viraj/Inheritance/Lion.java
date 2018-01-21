package com.viraj.Inheritance;

public class Lion extends Cat {

	private boolean isBrave;

	public Lion(String name, String color, int amountOfSpeed, int amountOfPower, int numberOflegs, boolean canHuntOtherAnimals, boolean isBrave) {
		super(name, color, amountOfSpeed, amountOfPower, numberOflegs, canHuntOtherAnimals);
		this.isBrave = isBrave;
	}

}
