package athensproject.model;

import java.util.List;

public abstract class SnakeState {
    abstract public void add();
    abstract public SnakeState goUp();
    abstract public SnakeState goDown();
    abstract public SnakeState goRight();
    abstract public SnakeState goLeft();

    void addByCoordinates(int x, int y){
        Field head = Snake.getHead();
        int headX = head.getX();
        int headY = head.getY();
        List<Field> snakeBody = Snake.getSnakeFields();
        snakeBody.add(0, new Field(headX + x, headY + y));
    }
}
