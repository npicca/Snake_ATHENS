package athensproject.model;

import java.util.List;

public class SnakeGoingUp implements SnakeState {
    private Snake snake;

    SnakeGoingUp(Snake snake) {
        this.snake = snake;
    }

    public void add() {
        // Get coordinates of snake's head
        Field head = snake.getHead();
        int headX = head.getX();
        int headY = head.getY();

        List<Field> snakeBody = snake.getSnakeFields();
        snakeBody.add(0, new Field(headX, headY - 1));
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
