package org.tic_tac_toe;

import org.tic_tac_toe.enums.GameStatus;
import org.tic_tac_toe.impl.gameStateImpl.InProgressState;
import org.tic_tac_toe.impl.gameStateImpl.WinnerState;
import org.tic_tac_toe.impl.winningImpl.ColumnWinningStrategy;
import org.tic_tac_toe.impl.winningImpl.DiagonalStrategy;
import org.tic_tac_toe.impl.winningImpl.RowWinningStrategy;
import org.tic_tac_toe.observer.impl.Scoreboard;

import java.util.List;

public class Game extends GameSubject {
    private Board board;
    private Player player1;
    private Player player2;
    private Player winner;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;
    private GameStatus gameStatus;
    private Player currentPlayer;

    public Game(Player player1, Player player2, int size) {
        this.board = new Board(size);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.gameState = new InProgressState();
        this.winningStrategies = List.of(
            new DiagonalStrategy(),
            new ColumnWinningStrategy(),
            new RowWinningStrategy()
        );
    }
    public void switchPlayer() {
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
    public Board getBoard() {
        return board;
    }
    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    };
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void makeMove(Player player, int col, int row) {

        gameState.handleMove(this, player, row, col);
    }

    public boolean checkWinner(Player player) {
        for (WinningStrategy strategy : winningStrategies) {
            if (strategy.checkWinner(board.getBoard(), player.getSymbol())) {
                return true;
            }
        }
        return false;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setState(GameState gameState) {
        this.gameState = gameState;

        if (gameStatus != GameStatus.IN_PROGRESS) {
            notifyObserver();
        }
    }

}
