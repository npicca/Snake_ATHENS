package athensproject.model;

import java.util.List;


public class SnakeGoingDown extends SnakeState {

    private Snake snake;

    SnakeGoingDown(Snake snake) {
        this.snake = snake;
    }

    public void add() {
        addByCoordinates(0,1);

    }

    public SnakeState goUp() {
        return null;
    }

    public SnakeState goDown() {
        return null;
    }

    public SnakeState goRight() {
        return new SnakeGoingRight(snake);
    }

    public SnakeState goLeft() {
        return new SnakeGoingLeft(snake);
    }
}
