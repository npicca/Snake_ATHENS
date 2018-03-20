package athensproject;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by lsienko on 20.03.18.
 */
public class MainPanel extends JPanel {

    private Graphics graph;


    public MainPanel() {
        this.setBackground(Color.blue);
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






    }




}
