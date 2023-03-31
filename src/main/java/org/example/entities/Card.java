package org.example.entities;

public class Card {
    private String suit;
    private Integer rank;
    private String cardType;


    public Card(String suit, Integer rank) {
        this.suit = suit;
        this.rank = rank;
    }



    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
