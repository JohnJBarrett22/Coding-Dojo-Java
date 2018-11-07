package com.codingdojo.java.zookeeper1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla has thrown something at you!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla eats some bananas and instantly becomes happier with its surroundings.");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla climbs a nearby tree, but exerts a good portion of energy doing so.");
		displayEnergy();
	}
}
