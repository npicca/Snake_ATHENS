package athensproject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardHandler implements KeyListener {

    public void keyTyped(KeyEvent keyEvent) {
        ; //this should be left blank, arrow keys don't count as keypresses
    }

    public void keyPressed(KeyEvent keyEvent) {
    	int key = keyEvent.getKeyCode();
    	if(key == keyEvent.VK_UP){
    		Snake.changeDirection(MoveDirections.UP);
    	}
    	if(key == keyEvent.VK_DOWN){
    		Snake.changeDirection(MoveDirections.DOWN);
    	}
    	if(key == keyEvent.VK_LEFT){
    		Snake.changeDirection(MoveDirections.LEFT);
    	}
    	if(key == keyEvent.VK_RIGHT){
    		Snake.changeDirection(MoveDirections.RIGHT);
    	}//This should change the snake movement direction invoking the changeDirection method of snake
    }

    public void keyReleased(KeyEvent keyEvent) {
        //The change direction is implemented in the KetPressed(). The KeyReleased needs not be implemented.
    }
}
