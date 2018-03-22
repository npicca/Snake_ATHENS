package athensproject.controller;

import java.util.ArrayList;
import java.util.List;

public class GameOver {
    private static List<Restart> restartables = new ArrayList<Restart>();
    public static void addRestartable(Restart r){
        restartables.add(r);
    }
    public static void reset(){
        for(Restart r:restartables){
            r.restart();
        }
    }
}
