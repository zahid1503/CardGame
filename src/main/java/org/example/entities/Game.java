package org.example.entities;
import java.util.*;
public class Game {
    private Deck deck;
    private List<Hand> listOfPlayers;
    private List<Card> cards;
    private int currentPlayerIndex ;

    private TurnDirection direction;

    public TurnDirection getDirection() {
        return direction;
    }

    public void setDirection(TurnDirection direction) {
        this.direction = direction;
    }

    public Game(List<Hand> listOfPlayers, List<Card> cards, int currentPlayerIndex) {
//        this.deck = deck;
        this.listOfPlayers = listOfPlayers;
        this.cards = cards;
        currentPlayerIndex = 0;
        direction = TurnDirection.CLOCKWISE;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<Hand> getListOfPlayers() {
        return listOfPlayers;
    }

    public int getPlayersSize(){
        return listOfPlayers.size();
    }

    public void setListOfPlayers(List<Hand> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }
    @Override
    public String toString() {
        return "Game{" +
                "deck=" + deck +
                ", listOfPlayers=" + listOfPlayers +
                ", cards=" + cards +
                ", currentPlayerIndex=" + currentPlayerIndex +
                '}';
    }
}
