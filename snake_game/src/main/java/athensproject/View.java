package athensproject;

import javax.swing.*;

public class View {
    private MainWindow ourWiev;



    public View(MainWindow window){
        //attaches the view to the main windov
        ourWiev = window;
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1);
        //frame.setVisible(true);


    }

    public static void update(){
        //This method will be called every tick, getting model information using Snake.getSnakePixels() and Grid.getFruit()

    }






}
