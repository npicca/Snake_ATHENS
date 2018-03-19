package athensproject;

public class State{

    private static Snake snake;
    private static Grid grid;

    public State(){
        grid = new Grid();
        snake = new Snake();
    }


    static boolean isFruitEaten(){
        //checks whether the fruit is being eaten by the snake
        return true;
    }

    static void update(){
        Snake.doMove();
        if(snake.isDead()){
            //lose the game
        }
        else if(isFruitEaten()){
            //increment score

            Grid.spawnFruit();
        }

    }
}
