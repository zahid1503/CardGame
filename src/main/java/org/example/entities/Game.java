package org.example.entities;
import java.util.*;
public class Game {
    private List<Player> listOfPlayers;
    private List<Card> cards;
    private int CurrentPlayerIndex ;

    public Game(List<Player> listOfPlayers, List<Card> cards, int currentPlayerIndex) {
        this.listOfPlayers = listOfPlayers;
        this.cards = cards;
        CurrentPlayerIndex = currentPlayerIndex;
    }

    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(List<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public int getCurrentPlayerIndex() {
        return CurrentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        CurrentPlayerIndex = currentPlayerIndex;
    }

    @Override
    public String toString() {
        return "Game{" +
                "listOfPlayers=" + listOfPlayers +
                ", cards=" + cards +
                ", CurrentPlayerIndex=" + CurrentPlayerIndex +
                '}';
    }
}
