package athensproject.model;
import athensproject.GameSettings;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public enum Apple{

    CLASSIC, MEDIUMSPEED,FASTSPEED ;

    private Image classicImage, mediumImage, fastImage;


    Apple(){

        classicImage = null;
        try {
            classicImage = ImageIO.read(new File(GameSettings.CLASSICAPPLE_IMAGE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("hotovo");

        mediumImage = null;
        try {
            mediumImage = ImageIO.read(new File(GameSettings.MEDIUMAPPLE_IMAGE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }

        fastImage = null;
        try {
            fastImage = ImageIO.read(new File(GameSettings.FASTAPPLE_IMAGE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Apple generateNewApple() {

        Random rand = new Random();

        int  n = rand.nextInt(3);
        //System.out.println("Random number for Apple is :");
        //System.out.println(n);

        switch (n) {
            case 0:   return FASTSPEED;
            case 1:   return MEDIUMSPEED;
            default:  return CLASSIC;
        }
    }

    public Image getImage(){

        if ( this.equals( Apple.CLASSIC ) ) return classicImage;
        if ( this.equals( Apple.MEDIUMSPEED ) ) return mediumImage;
        if ( this.equals( Apple.FASTSPEED ) ) return fastImage;

        return classicImage;
    }


}
