# Zoo Keeper: Part One

A zoo keeper has asked for your help creating a way for her to track her animals energy levels. In particular, she is having difficulty tracking the mammals. Every mammal should have an energy level (default 100). They should all be able to display their energy levels when asked through the displayEnergy method, which should print and return the energy level.

Once this is done, she has asked that you also create a separate class of gorilla, which can throw things at people but will lose energy (-5) whenever this is done. The gorilla should also be able to eatBananas and regain energy (+10). The gorilla should also be able to climb at the expense of energy (-10).

She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times, eat bananas twice and climb once; then print the gorilla's energy level.

## Objectives:
* Implement packages to namespace your project.
* Implement inheritance.

## Tasks:
* Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animals energy level as well as return it.
* Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
* For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
* For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
* For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
* Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
