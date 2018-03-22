package athensproject.controller;

import athensproject.model.*;

import java.util.List;
import java.util.Timer;

import static athensproject.model.MoveDirection.*;

/**
 * Created by lsienko on 20.03.18.
 */
public class SnakeController {

    public static GameSpeed gamespeed;
    public static Timer threadID;

    public static void moveSnakeAndUpdateGameState() {
        doMoveByUpdatingSnakeFields();

        if(Snake.isDead()){
            //close window
            System.out.println("You Lost!");
            System.exit(0);
        }

        else if (Grid.isFruitEaten()){
        	Score scoreObject = Score.getInstance();
        	scoreObject.updateScore();
        	scoreObject.showScore();
            SnakeController.growSnake();
            Grid.spawnFruit();


            switch ( scoreObject.getScore() % 3 ) {
                case 0:
                    gamespeed = new SlowSpeed();
                    break;
                case 1:
                    gamespeed = new MiddleSpeed();

                    break;
                case 2: gamespeed = new FastSpeed();
                    break;
            }
            // Start a new thread
            threadID = gamespeed.restartGame( threadID );




        }

    }

    public static void changeState(SnakeState state) {
        SnakeState currentState = Grid.getSnake().getCurrentState();


        if (state == null || (currentState instanceof SnakeGoingUp && state instanceof SnakeGoingDown) ||
                (currentState instanceof SnakeGoingDown && state instanceof SnakeGoingUp ||
                        (currentState instanceof SnakeGoingLeft && state instanceof SnakeGoingRight)||
                        (currentState instanceof SnakeGoingRight && state instanceof SnakeGoingLeft))) {
            return;
        }

        Grid.getSnake().setCurrentState(state);
    }

    /**
     * Add a pixel to the snake in the presentDirection it's facing and removes the last one from his body
     */
    public static void doMoveByUpdatingSnakeFields() {
        Snake snake = Grid.getSnake();
        List<Field> snakeBody = snake.getSnakeFields();
        // Save pixel to be removed and remove it (tip of the snakeBody)
        snake.setLastRemovedField(snakeBody.get(snakeBody.size() - 1));
        snakeBody.remove(snakeBody.size() - 1);

        // Add new pixel in specified presentDirection
        Snake.getCurrentState().add();
        KeyboardHandlerSingleton.getInstance().unlock(); //unlocks controller for next move
    }

    public static void growSnake() {
        Snake snake = Grid.getSnake();
        snake.getSnakeFields().add(snake.getSnakeFields().size(), snake.getLastRemovedField());
    }
}
