package athensproject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by lsienko on 20.03.18.
 */
public class MainPanel extends JPanel {

    private Graphics graph;
    private BufferedImage apple;


    public MainPanel() {
        this.setBackground(Color.blue);
        apple = null;
        try {
            apple = ImageIO.read(new File("apple.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drawRect(int coorX,int coorY) {

        graph.setColor(Color.CYAN);
        graph.fill3DRect(coorX, coorY, 25, 25,true);
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        this.graph = graphics;
        /* this.setForeground(Color.BLUE); */

        graph.setColor( Color.DARK_GRAY );
        graph.fill3DRect(0, 0, 1000, 1000,true);

        List<Pixel> snakeList = Snake.getSnakePixels();

        for ( Pixel snakePixel : snakeList ){
            drawRect( snakePixel.getX()*25, snakePixel.getY()*25 );

        }



        Pixel fruitPos = Grid.getFruit();
        graph.drawImage(apple, 25*fruitPos.getX(), 25*fruitPos.getY(), null);

    }




}
