package org.example.services;

import org.example.entities.Player;

import java.util.List;

public interface IGameService {

    void startGame(List<Player> players);

    void playCard();
    void drawCard();
    void getNextPlayer();
    void changePlayOrder();
    void skipNextPlayer();
    void drawTwoCards();

}
