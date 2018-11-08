package com.codingdojo.java.pets.models;

public abstract class Animal {
	
	//Attributes
	protected String name;
	protected String breed;
	protected Double weight;
	
	public Animal(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	//Getters
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public Double getWeight() {
		return weight;
	}

	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
