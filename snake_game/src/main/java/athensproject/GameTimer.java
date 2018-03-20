package athensproject;

import java.util.TimerTask;

public class GameTimer extends TimerTask {
    public static final int TICK = 300; //game tick in ms

    @Override
    public void run() {
        //updates game state and refreshes the view. This is run every tick
        State.update();
        View.update();

    }
}
