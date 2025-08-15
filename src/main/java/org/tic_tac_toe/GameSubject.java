package org.tic_tac_toe;

import org.tic_tac_toe.observer.GameObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class GameSubject {
    private final List<GameObserver> observers = new ArrayList<>();

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }
    public void notifyObserver() {
        for(GameObserver observer : observers) {
            observer.update((Game)this);
        }
    }
}
