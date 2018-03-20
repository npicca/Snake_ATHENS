package athensproject;

import java.util.Random;

public class Grid {
    public static int width = 50;
    public static int height = 50;
    private static Pixel fruit;

    public static Pixel getFruit() {
        return fruit;
    }

    public Grid(){
        spawnFruit();
    }

    public static void spawnFruit(){
        fruit = new Pixel(new Random().nextInt(MainWindow.WINDOW_WIDTH), new Random().nextInt(MainWindow.WINDOW_HEIGHT));
    }
}
