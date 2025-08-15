package org.tic_tac_toe;

import org.tic_tac_toe.enums.Symbol;

public class Cell {
    private Symbol cellValue;

    public Cell() {
        this.cellValue = Symbol.EMPTY;
    }

    public Symbol getCellValue() {
        return cellValue;
    }

    public void setCellValue(Symbol symbol) {
        if (symbol == null) {
            throw new IllegalArgumentException("Symbol cannot be null");
        }
        this.cellValue = symbol;
    }
}
