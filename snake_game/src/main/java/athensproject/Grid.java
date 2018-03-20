package athensproject;

import java.util.Random;

public class Grid {
    public static int width = 40;
    public static int height = 40;
    private static Pixel fruit;

    public static Pixel getFruit() {
        return fruit;
    }

    public Grid(){
        spawnFruit();
    }

    public static void spawnFruit(){
        fruit = new Pixel(new Random().nextInt(width-10), new Random().nextInt(height-10));
    }
}
