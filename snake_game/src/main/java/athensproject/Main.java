package athensproject;

import athensproject.controller.GameSpeed;
import athensproject.controller.SlowSpeed;
import athensproject.controller.SnakeController;
import athensproject.view.MainPanel;
import athensproject.view.MainWindow;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static MainWindow mainWindow;
    public static MainPanel mainPanel;


    public static void main(String[] args) {
        mainWindow = MainWindow.getInstance();
        mainPanel = mainWindow.getMainPanel();

        startUpGUI();




        // Set speed of snake
        SnakeController.gamespeed = new SlowSpeed();
        SnakeController.threadID = new Timer();

        SnakeController.threadID.schedule(new TimerTask() {
            @Override
            public void run() {
                SnakeController.moveSnakeAndUpdateGameState();
                mainPanel.repaint();
            }
        }, 0, GameSettings.GAME_TICK_TIME_MILLISEC);




    }

    private static void startUpGUI() {
        try {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    mainWindow.pack();
                    mainWindow.setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
