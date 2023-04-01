package org.example.entities;

public class Card {
    private Suit suit;
    private Rank rank;
    private String cardType;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

    }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
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
