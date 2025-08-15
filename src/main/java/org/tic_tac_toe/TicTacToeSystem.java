package org.tic_tac_toe;

import org.tic_tac_toe.enums.GameStatus;
import org.tic_tac_toe.observer.impl.Scoreboard;

public class TicTacToeSystem {
    private Game game;
    private static volatile TicTacToeSystem instance;
    private final Scoreboard scoreboard;

    private TicTacToeSystem() {
        this.scoreboard = new Scoreboard();
    }

    public static synchronized TicTacToeSystem getInstance() {
        if (instance == null) {
            instance = new TicTacToeSystem();
        }
        return instance;
    }

    public void createGame(Player player1, Player player2, int size) {
        this.game = new Game(player1, player2, size);
        this.game.addObserver(scoreboard);
    }

    public void makeMove(Player player, int col, int row) {
        if (game == null) {
            throw new IllegalStateException("No game has been created");
        }
        game.makeMove(player, col, row);
    }

    public void printBoard() {
        if (game == null) {
            throw new IllegalStateException("No game has been created");
        }
        game.getBoard().printBoard();
    }
    public void printScoreboard() {
        scoreboard.printScoreboard();
    }
}
