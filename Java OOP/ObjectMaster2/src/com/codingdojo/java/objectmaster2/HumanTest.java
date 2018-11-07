package com.codingdojo.java.objectmaster2;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Garth");
		Human testHuman2 = new Human("Toby");
		Human testHuman3 = new Human("Keith");
		Wizard testWizard1 = new Wizard("Karazhan");
		Wizard testWizard2 = new Wizard("Khadgar");
		Wizard testWizard3 = new Wizard("Medivh");
		Ninja testNinja1 = new Ninja("Choi");
		Ninja testNinja2 = new Ninja("Raphael");
		Ninja testNinja3 = new Ninja("Donatello");
		Samurai testSamurai1 = new Samurai("Genji");
		Samurai testSamurai2 = new Samurai("Hanzo");
		Samurai testSamurai3 = new Samurai("Ji");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}
