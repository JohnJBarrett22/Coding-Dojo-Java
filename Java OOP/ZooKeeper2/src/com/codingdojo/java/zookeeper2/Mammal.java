package com.codingdojo.java.zookeeper2;

public class Mammal {
	int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
}
