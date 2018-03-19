package athensproject;

import java.util.Timer;

import static athensproject.GameTimer.TICK;

/**
 * Hello world!
 *
 */



public class App 
{
    private static MainWindow mw;


    public static void main( String[] args )
    {

        startUpGUI();
        new State();
        new Timer().schedule(new GameTimer(), 0, TICK);

    }

    private static void startUpGUI() {
        try {
            mw = new MainWindow(1000, 1000);
            mw.addKeyListener(new KeyboardHandler());
            new View(mw);
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    mw.pack();
                    mw.setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
