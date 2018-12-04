# Object Master: Part Two

The club liked your work so much that they asked you to build out their character choices a bit more. They want you to add Ninja, Wizard, and Samurai classes, but they also want any modifications they make to the Human class to extend to these.

In addition to that, each class will have some unique features:

The Wizard class should have a default health of 50 and intelligence of 8; a method called heal that heals whomever it was cast on for an amount equal to the wizard's intelligence; and a method called fireball that decreases the health of whichever object it attacked by 3 * the wizard's intelligence.

The Ninja class should have a default stealth of 10; a method, steal, that takes health from another human by their stealth level, and a way to run away that decreases their health by 10.

The Samurai class should have a default health of 200; a method called deathBlow that attacks an object and decreases its health to 0, but also halves the Samurai's health; a method called meditate which heals the Samurai back to full health; and a method called howMany that returns the current number of Samurai.

Once you are done with this, they would like to see a sample test of the various classes interacting.

## Objectives:
* Implement packages to namespace your project.
* Implement inheritance.

## Tasks:
* Create Ninja, Wizard, and Samurai classes that all extend from the Human class.
* Wizard: Set default health to 50
* Wizard: Set default intelligence to 8
* Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
* Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
* Ninja: Set default stealth to 10
* Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
* Ninja: Add a method runAway() that decreases their health by 10
* Samurai: Set a default health of 200
* Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
* Samurai: Add a method meditate() that heals the Samurai for half of their current health.
* Samurai: Add a method howMany() that returns the total current number of Samurai.
