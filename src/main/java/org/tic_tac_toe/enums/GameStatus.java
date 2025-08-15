package org.tic_tac_toe.enums;

public enum GameStatus {
    IN_PROGRESS("Game is in progress"),
    X_WINS("Player X wins"),
    O_WINS("Player O wins"),
    DRAW("Game is a draw");

    private final String message;

    GameStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
