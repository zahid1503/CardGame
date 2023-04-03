package org.example.services;

import org.example.entities.Card;
import org.example.entities.Hand;
import org.example.entities.Player;
import org.example.entities.TurnDirection;

public interface IGameService {
    void startGame();
    void playCard(Card card,Hand hand);
    void drawCard(Hand hand);
    Player getNextPlayer();
    void changePlayOrder(TurnDirection turnDirection);
    void skipNextPlayer();
}
