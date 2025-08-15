package org.tic_tac_toe.impl.gameStateImpl;

import org.tic_tac_toe.Game;
import org.tic_tac_toe.GameState;
import org.tic_tac_toe.Player;
import org.tic_tac_toe.enums.Symbol;
import org.tic_tac_toe.enums.GameStatus;

public class InProgressState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        if (game.getCurrentPlayer() != player) {
            throw new IllegalStateException("It's not your turn!");
        }

        game.getBoard().setCell(row, col, player.getSymbol());

        if (game.checkWinner(player)) {
            game.setWinner(player);
            game.setGameStatus(player.getSymbol() == Symbol.O ? GameStatus.O_WINS : GameStatus.X_WINS);
            game.setState(new WinnerState());
        } else if (game.getBoard().isFull()) {
            game.setGameStatus(GameStatus.DRAW);
            game.setState(new DrawState());
        } else {
            game.switchPlayer();
        }
    }
}
