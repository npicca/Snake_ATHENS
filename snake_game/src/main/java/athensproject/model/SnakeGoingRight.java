package athensproject.model;

import java.util.List;

public class SnakeGoingRight implements SnakeState {
    private Snake snake;

    SnakeGoingRight(Snake snake) {
        this.snake = snake;
    }

    public void add() {
        // Get coordinates of snake's head
        Field head = snake.getHead();
        int headX = head.getX();
        int headY = head.getY();

        List<Field> snakeBody = snake.getSnakeFields();
        snakeBody.add(0, new Field(headX + 1, headY));
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
