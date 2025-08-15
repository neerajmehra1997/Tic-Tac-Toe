package org.tic_tac_toe.impl.winningImpl;

import org.tic_tac_toe.Cell;
import org.tic_tac_toe.WinningStrategy;
import org.tic_tac_toe.enums.Symbol;

public class RowWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Cell[][] board, Symbol symbol) {
        for (int row = 0; row < board.length; row++) {
            boolean win = true;
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].getCellValue() != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkDraw(Symbol[][] board) {
        for (Symbol[] row : board) {
            for (Symbol cell : row) {
                if (cell == Symbol.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
