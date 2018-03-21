We have decided to use strategy pattern here because we need to change behaviour of the snake dynamically. 
We have created interface GameSpeed and 3 classes which implement that interface. There are SlowSpeed, MediumSpeed and FastSpeed. 
We have implemented restarGame method which stops current timer and creates new one and then snake's speed is adjusted accordingly to the new timer. 
Speed changes are triggered by eating an apple.

