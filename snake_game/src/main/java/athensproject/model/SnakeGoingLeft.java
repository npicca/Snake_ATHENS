package athensproject.model;

import java.util.List;

public class SnakeGoingLeft extends SnakeState {

    private Snake snake;

    SnakeGoingLeft(Snake snake) {
        this.snake = snake;
    }

    public void add() {

        addByCoordinates(-1,0);

    }


    public SnakeState goUp() {
        return new SnakeGoingUp(snake);
    }

    public SnakeState goDown() {
        return new SnakeGoingDown(snake);
    }

    public SnakeState goRight() {
        return null;
    }

    public SnakeState goLeft() {
        return null;
    }
}
