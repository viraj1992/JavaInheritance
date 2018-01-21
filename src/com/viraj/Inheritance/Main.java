package com.viraj.Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myAnimal = new Animal("Tiger","Orange", 66, 67);
		System.out.println(myAnimal.toString());
		
		Cat myCat = new Cat("Tom", "Golden", 55, 88, 4, true);
		System.out.println(myCat.toString());
		
		System.out.println(myCat.outputSomeValuesToTheString());
		
		Lion myLion = new Lion("Lion", "Yellow", 88, 90, 4, true, true);
		System.out.println(myLion.toString());
		
		
		
		

	}

}
