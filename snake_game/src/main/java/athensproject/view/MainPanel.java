package athensproject.view;

import athensproject.GameSettings;
import athensproject.model.Grid;
import athensproject.model.Field;
import athensproject.model.Snake;

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

    private void drawRect(int coorX,int coorY, Color color) {
        graph.setColor(color);
        graph.fill3DRect(coorX, coorY, GameSettings.SNAKE_THICKNESS_IN_PIXELS, GameSettings.SNAKE_THICKNESS_IN_PIXELS,true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        this.graph = graphics;

        graph.setColor( Color.DARK_GRAY );
        graph.fill3DRect(0, 0, 1000, 1000,true);

        List<Field> snakeList = Snake.getSnakeFields();

        // Draw snake's head
        Field head = snakeList.get(0);
        drawRect(head.getX()*25, head.getY()*25, GameSettings.SNAKE_HEAD_COLOR);

        // Draw snake's body
        Field snakeField;
        for (int i = 1; i < snakeList.size(); i++) {
            snakeField = snakeList.get(i);
            drawRect( snakeField.getX()*25, snakeField.getY()*25, GameSettings.SNAKE_BODY_COLOR);
        }

        Field fruitPos = Grid.getFruitPosition();
        graph.drawImage(Grid.getApple().getImage() , 25*fruitPos.getX(), 25*fruitPos.getY(), null);

    }

}
