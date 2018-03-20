package athensproject.view;

import athensproject.GameSettings;
import athensproject.controller.KeyboardHandler;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private static MainWindow instance = new MainWindow();
    public static MainPanel mainPanel;

    private MainWindow() {
        this.setTitle(GameSettings.WINDOW_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(GameSettings.WINDOW_WIDTH_IN_PIXELS, GameSettings.WINDOW_HEIGHT_IN_PIXELS));
        this.putWindowOnCentralPosition();

        mainPanel = new MainPanel();
        this.add(mainPanel, BorderLayout.CENTER);

        this.addKeyListener(new KeyboardHandler());
    }

    public static MainWindow getInstance() {
        return MainWindow.instance;
    }

    private void putWindowOnCentralPosition() {
        final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        final int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        int left = (screenWidth - GameSettings.WINDOW_WIDTH_IN_PIXELS) / 2;
        int top = (screenHeight - GameSettings.WINDOW_HEIGHT_IN_PIXELS) / 2;
        setLocation(left, top);
    }

    public static MainPanel getMainPanel() {
        return mainPanel;
    }
}
