package org.tic_tac_toe;

public interface GameState {
    void handleMove(Game game, Player player, int row, int col);
}
