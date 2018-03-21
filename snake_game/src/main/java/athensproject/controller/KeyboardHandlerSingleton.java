package athensproject.controller;

import athensproject.model.MoveDirection;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardHandlerSingleton extends KeyAdapter {
	/*
		This method is changing the snake movement direction invoking the changeDirection method of snake.
		Method is called when key is pressed.
	 */
	private boolean isLocked = false;
	private static KeyboardHandlerSingleton instance = new KeyboardHandlerSingleton();

	private KeyboardHandlerSingleton(){
		;
	}

	public static KeyboardHandlerSingleton getInstance(){
		return instance;
	}

    public void keyPressed(KeyEvent keyEvent) {
    	int pressedKeyCode = keyEvent.getKeyCode();
		MoveDirection directionToMoveTheSnake = MoveDirection.getMoveDirectionByPressedKeyCode(pressedKeyCode);
		if (directionToMoveTheSnake != null && ! isLocked) {
			SnakeController.changeDirection(directionToMoveTheSnake);
			isLocked = true;
		}
    }
    public void unlock(){
    	this.isLocked = false;
	}
}
