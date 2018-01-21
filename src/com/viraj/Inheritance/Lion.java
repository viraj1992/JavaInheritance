package com.viraj.Inheritance;

public class Lion extends Cat {

	private boolean isBrave;

	public Lion(String name, String color, int amountOfSpeed, int amountOfPower, int numberOflegs, boolean canHuntOtherAnimals, boolean isBrave) {
		super(name, color, amountOfSpeed, amountOfPower, numberOflegs, canHuntOtherAnimals);
		this.isBrave = isBrave;
	}
	
	// Set isBrave
	
	public void setIsBrave(boolean isBrave) {
		this.isBrave = isBrave;
	}
	
	// Get isBrave
	
	public boolean getIsBrave() {
		return isBrave;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format(" | %s : %b","Is Brave", isBrave);
	}

}
