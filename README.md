# Snake_ATHENS
Simple Snake implementation for Design Pattern Course

Game is controlled by arrows and your goal is to eat as many apples as you can without crashing into wall or your body.

Design patterns usage:

	Singleton pattern:
 		- score class
 		- grid class
 		- main window class
		- keyboard handler class
	
  	Strategy pattern:
		- speed of the snake
		
We have decided to use strategy pattern here because we need to change behaviour of the snake dynamically. We have created interface GameSpeed and 3 classes which implement that interface. There are SlowSpeed, MediumSpeed and FastSpeed. We have implemented restarGame method which stops current timer and creates new one and then snake's speed is adjusted accordingly to the new timer. Speed changes are triggered by eating an apple.
