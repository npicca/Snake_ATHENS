package athensproject;

public class View {

    private static MainPanel panel;

    public View(MainWindow window){
        this.panel = window.getMainPanel();
    }

    public static void update() {
        panel.repaint();


    }

}
