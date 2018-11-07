package com.codingdojo.java.objectmaster1;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja1 = new Human("Kobe");
			Human samurai1 = new Human("Shaq");
			Human wizard1 = new Human("Phil");
			
			wizard1.attack(ninja1);
			samurai1.attack(ninja1);
			ninja1.attack(samurai1);
	}
}
