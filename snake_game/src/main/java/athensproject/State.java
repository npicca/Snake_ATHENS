package athensproject;

import javax.swing.*;

public class State{

    private static Snake snake;
    private static Grid grid;

    public State(){
        grid = new Grid();
        snake = new Snake();
    }


    private static boolean isFruitEaten(){
        System.out.println(snake.getHead().getX());
        System.out.println(grid.getFruit().getX());
        return snake.getHead().equals(grid.getFruit());
    }

    static void update(){
        Snake.doMove();

        if(snake.isDead()){
            //close window
            System.out.println("You Lost!");
            System.exit(0);
        }

        else if(isFruitEaten()){
            snake.grow();
            Grid.spawnFruit();
        }

    }
}
