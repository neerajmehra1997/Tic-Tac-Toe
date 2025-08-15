package org.tic_tac_toe.observer.impl;

import org.tic_tac_toe.Game;
import org.tic_tac_toe.observer.GameObserver;

import java.util.HashMap;
import java.util.Map;

public class Scoreboard implements GameObserver {

    private final Map<String, Integer> scores;

    public Scoreboard() {
        this.scores = new HashMap<>();
    }

    @Override
    public void update(Game game) {

        if (game.getWinner() != null) {
            String winner = game.getWinner().getName();
            scores.put(winner, scores.getOrDefault(winner, 0) + 1);
        }
    }
    public void printScoreboard() {
        System.out.println("\n--- Overall Scoreboard ---");
        if (scores.isEmpty()) {
            System.out.println("No games with a winner have been played yet.");
            return;
        }
        scores.forEach((playerName, score) ->
                System.out.printf("Player: %-10s | Wins: %d%n", playerName, score)
        );
        System.out.println("--------------------------\n");
    }

}
