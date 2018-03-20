package athensproject;

import java.util.Random;

public class Grid {
    public static int width = 25;
    public static int height = 25;
    private static Pixel fruit;

    public static Pixel getFruit() {
        return fruit;
    }

    public Grid(){
        spawnFruit();
    }

    public static void spawnFruit(){
        fruit = new Pixel(new Random().nextInt(width), new Random().nextInt(height));
    }
}
