package org.example.entities;
import java.util.*;
public class Game {
    private Deck deck;
    private List<Player> listOfPlayers;
    private List<Card> cards;
    private int currentPlayerIndex ;

    public Game(Deck deck, List<Player> listOfPlayers, List<Card> cards, int currentPlayerIndex) {
        this.deck = deck;
        this.listOfPlayers = listOfPlayers;
        this.cards = cards;
        currentPlayerIndex = currentPlayerIndex;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public int getPlayersSize(){
        return listOfPlayers.size();
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
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {

        currentPlayerIndex = currentPlayerIndex;
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
