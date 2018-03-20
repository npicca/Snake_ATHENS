package athensproject.controller;

import athensproject.model.MoveDirection;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardHandler extends KeyAdapter {
	/*
		This method is changing the snake movement direction invoking the changeDirection method of snake.
		Method is called when key is pressed.
	 */
    public void keyPressed(KeyEvent keyEvent) {
    	int pressedKeyCode = keyEvent.getKeyCode();
		MoveDirection directionToMoveTheSnake = MoveDirection.getMoveDirectionByPressedKeyCode(pressedKeyCode);
		if (directionToMoveTheSnake != null) {
			SnakeController.changeDirection(directionToMoveTheSnake);
		}
    }
}
