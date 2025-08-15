package org.tic_tac_toe.impl.gameStateImpl;

import org.tic_tac_toe.Game;
import org.tic_tac_toe.GameState;
import org.tic_tac_toe.Player;

public class DrawState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        // In a draw state, no further moves can be made
        throw new IllegalStateException("The game is already a draw. No further moves allowed.");
    }
}
