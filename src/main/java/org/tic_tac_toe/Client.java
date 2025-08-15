package org.tic_tac_toe;

import org.tic_tac_toe.enums.Symbol;

public class Client {
    public static void main(String[] args) {
        TicTacToeSystem ticTacToeSystem = TicTacToeSystem.getInstance();
        Player alice = new Player("Alice", Symbol.X);
        Player bob = new Player("Bob", Symbol.O);

        ticTacToeSystem.createGame(alice, bob, 3);

        ticTacToeSystem.makeMove(alice, 0, 0);
        ticTacToeSystem.makeMove(bob, 1, 0);
        ticTacToeSystem.makeMove(alice, 0, 1);
        ticTacToeSystem.makeMove(bob, 1, 1);
        ticTacToeSystem.makeMove(alice, 0, 2);
        ticTacToeSystem.printBoard();
        ticTacToeSystem.printScoreboard();
    }
}
