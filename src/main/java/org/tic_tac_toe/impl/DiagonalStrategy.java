package org.tic_tac_toe.impl;

import org.tic_tac_toe.WinningStrategy;
import org.tic_tac_toe.enums.Symbol;

public class DiagonalStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Symbol[][] board, Symbol symbol) {
        return false;
    }

    @Override
    public boolean checkDraw(Symbol[][] board) {
        return false;
    }
}
