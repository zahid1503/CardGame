package org.example.entities;
import java.util.*;

public class Player {
    private String playerName;
    private List<Card> listOfCards;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Card> getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(List<Card> listOfCards) {
        this.listOfCards = listOfCards;
    }

    public void addCardToHand(){

    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", listOfCards=" + listOfCards +
                '}';
    }
}
