package athensproject.model;

import java.awt.event.KeyEvent;

public enum MoveDirection {
    UP(KeyEvent.VK_UP),
    DOWN(KeyEvent.VK_DOWN),
    LEFT(KeyEvent.VK_LEFT),
    RIGHT(KeyEvent.VK_RIGHT);

    private Integer pressedKeyCode;

    MoveDirection(Integer pressedKeyCode) {
        this.pressedKeyCode = pressedKeyCode;
    }

    public Integer getPressedKeyCode() {
        return pressedKeyCode;
    }

    public static MoveDirection getMoveDirectionByPressedKeyCode(Integer pressedKeyCode) {
        for (MoveDirection direction : MoveDirection.values()) {
            if (direction.getPressedKeyCode().equals(pressedKeyCode)) {
                return direction;
            }
        }
        return null;
    }
}
