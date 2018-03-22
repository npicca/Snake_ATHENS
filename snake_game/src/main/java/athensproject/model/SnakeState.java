package athensproject.model;

public interface SnakeState {
    void add();
    SnakeState goUp();
    SnakeState goDown();
    SnakeState goRight();
    SnakeState goLeft();
}
