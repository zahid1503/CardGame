package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Hand extends Player{
    private List<Card> cards;

    public Hand(int id, String PlayerName) {
        super(id,PlayerName);
        cards = new ArrayList<>();
    }

    public String getCardsString() {
        String res = "";
        for (Card card : cards) {
            res = res.concat(card.getSuit().getSymbol() + card.getRank().getRank() +" ");
        }
        return res;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    public void addCardToHand(Card card) {
        cards.add(card);
    }

    public void removeCardFromHand(Card card) {
        cards.remove(card);
    }

    public int getCardSizeInHand() {
        return cards.size();
    }
}
