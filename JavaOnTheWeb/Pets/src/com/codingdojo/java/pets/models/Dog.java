package com.codingdojo.java.pets.models;

public class Dog extends Animal implements Pet {
	
	public Dog(String name, String breed, Double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		if(this.weight < 30) {
			return this.name + " hopped into on your lap and cuddled you!";
		}
		else {
			return this.name + " curled up next to you.";
		} 
	}

}
