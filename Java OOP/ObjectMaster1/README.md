# Object Master: Part One

A local D&D club has asked you to help them by creating the objects they might use with a simple Java program to track their players. To start, they would like to have only Humans in this particular campaign. The humans can all select various classes (Wizard, Ninja, Samurai).

They say that the humans should all have four properties: strength, intelligence, stealth, and health. The starting value for each of the properties should be 3, except for health - that should be 100. Each human should also have the ability to attack, where they decrease the health of whatever they attacked by their strength.

They want to see if you can make a class that they could use before anything further, so just implement the human class.

## Objectives:
* Implement packages to namespace your project.
* Implement inheritance.

## Tasks:
* Create a Human class
* Add the strength, stealth, and intelligence attributes with a default of 3
* Add the health attribute with a default of 100
* Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
* Test these methods work using a HumanTest class
