package athensproject.model;


public class SnakeGoingRight extends SnakeState {
    private Snake snake;

    SnakeGoingRight(Snake snake) {
        this.snake = snake;
    }

    public void add() {
        // Get coordinates of snake's head
        addByCoordinates(1,0);
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
