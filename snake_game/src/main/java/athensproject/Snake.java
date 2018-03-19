package athensproject;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private static MoveDirections direction;

    private static List<Pixel> tail = new ArrayList<Pixel>();
    public static void changeDirection(MoveDirections d){
        direction = d;
    }
    public static void doMove(){
        ;// adds a pixel to the snake in the direction it's facing and removes the last one from his tail
    }

    boolean isDead(){
        //checks whether snake is biting it's own tail or the wall
        return true;
    }

    public static List<Pixel> getSnakePixels() {
        return tail;
    }

}
