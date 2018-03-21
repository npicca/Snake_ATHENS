package athensproject.controller;

import java.util.Timer;

public interface GameSpeed {
        public Timer timer = null;
        public Timer getGameSpeed();
        public Timer restartGame( Timer stopTime );
}
