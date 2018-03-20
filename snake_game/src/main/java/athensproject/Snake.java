package athensproject;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private static MoveDirections direction;
    private static List<Pixel> tail = new ArrayList<Pixel>();
    private static Pixel lastRemovedPixel;

    public static void changeDirection(MoveDirections d){
        direction = d;
    }

    /**
     * Add a pixel to the snake in the direction it's facing and removes the last one from his tail
     */
    public static void doMove(){
        // Save pixel to be removed and remove it (tip of the tail)
        lastRemovedPixel = tail.get(tail.size() - 1);
        tail.remove(tail.size() - 1);

        // Get coordinates of snake's head
        Pixel head = getHead();
        int headX = head.getX();
        int headY = head.getY();

        // Add new pixel in specified direction
        switch ( direction )
        {
            case UP:
                tail.add(0, new Pixel(headX, headY + 1));
                break;
            case DOWN:
                tail.add(0, new Pixel(headX, headY - 1));
                break;
            case RIGHT:
                tail.add(0, new Pixel(headX + 1, headY));
                break;
            case LEFT:
                tail.add(0, new Pixel(headX - 1, headY));
                break;
        }
    }

    /**
     * Return snake's head.
     * @return Snake's head.
     */
    public static Pixel getHead() {
        return tail.get(0);
    }

    /**
     * Check whether snake is bitting it's own tail or the wall.
     * @return Whether the snake is dead.
     */
    boolean isDead(){
        // Get coordinates of snake's head
        Pixel head = getHead();
        int headX = head.getX();
        int headY = head.getY();

        return tail.indexOf(head) != -1 // Check for snake bitting itself
                || headX < 0 || headX > Grid.width // Check for snake bitting the wall
                || headY < 0 || headY > Grid.height;
    }

    /**
     * Make snake grow.
     */
    void grow() {
        tail.add(tail.size(), lastRemovedPixel);
    }


    public static List<Pixel> getSnakePixels() {
        return tail;
    }

}
