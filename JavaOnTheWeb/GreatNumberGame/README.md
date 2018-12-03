# Great Number Game

You have been asked to create a simple guessing game app. Your client has requested that you generate a number between 1 and 100, and allow a user to try and guess what number was generated. Each user should have a unique number each time they play the game, but the number should persist until they guess it correctly. When they guess incorrectly, you should tell them whether the guess was too high or too low.

## Objectives:
* Implementing post and session together with servlets

## Tasks:
* Generate a new number on first-time visits or after the game has ended
* Retain the value of the number across incorrect guesses while providing feedback to the user
* Only reset the number when the player asks to play again

Hint: When comparing two variables, use the .equals() method instead of "==", can you guess why?

## Optional Challenges:
* Allow the user to select the range of numbers they want to guess in (Example: -1000 to 1000)
* Give a fixed number of attempts and inform the user of what attempt they are on; after the user has attempted guessing too many times, give them a message informing them they have lost and tell them the answer; allow them to play again.
