package org.tic_tac_toe;

import org.tic_tac_toe.enums.Symbol;

/**
 * Player Class;
 */
public class Player {
    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
