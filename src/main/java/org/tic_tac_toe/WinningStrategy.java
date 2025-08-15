package org.tic_tac_toe;

import org.tic_tac_toe.enums.Symbol;

public interface WinningStrategy {
    /**
     * Checks if the current player has won the game.
     *
     * @param board The current state of the game board.
     * @param symbol The symbol of the current player (X or O).
     * @return true if the player has won, false otherwise.
     */
    boolean checkWinner(Symbol[][] board, Symbol symbol);

    /**
     * Checks if the game is a draw.
     *
     * @param board The current state of the game board.
     * @return true if the game is a draw, false otherwise.
     */
    boolean checkDraw(Symbol[][] board);
}
