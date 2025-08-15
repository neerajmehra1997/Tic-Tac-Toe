package org.tic_tac_toe.impl.winningImpl;

import org.tic_tac_toe.Cell;
import org.tic_tac_toe.WinningStrategy;
import org.tic_tac_toe.enums.Symbol;

public class ColumnWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Cell[][] board, Symbol symbol) {

        for (int col = 0; col < board[0].length; col++) {
            boolean win = true;
            for (int row = 0; row < board.length; row++) {
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
       return false;
    }
}
