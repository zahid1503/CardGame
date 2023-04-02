package org.example.services;

import org.example.entities.Card;
import org.example.entities.Hand;
import org.example.entities.Player;
import org.example.entities.TurnDirection;

import java.util.List;

public interface IGameService {

    void startGame(List<Hand> hands);

    void playCard(Player player, Card card,Hand hand);
    void drawCard(Hand hand , Player player);
    Player getNextPlayer();
    void changePlayOrder(List<Player> players, TurnDirection turnDirection);
    void skipNextPlayer(Player player);

}
