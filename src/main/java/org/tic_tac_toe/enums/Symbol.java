package org.tic_tac_toe.enums;

public enum Symbol {
    X("X"),
    O("O"),
    EMPTY(" ");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
