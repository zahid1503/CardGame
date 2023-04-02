package org.example.entities;

import java.util.Stack;

public class DiscardPile {
    private Stack<Card> cards;

    public DiscardPile() {
    }

    public DiscardPile(Stack<Card> cards) {
        this.cards = cards;
    }

    public boolean canCardBePlayed(Card drawnCard) {
        Rank drawnRank = drawnCard.getRank();
        Suit drawnSuit = drawnCard.getSuit();


        Card topCard = getTopCard();
        Rank topRank = topCard.getRank();
        Suit topSuit = topCard.getSuit();

        if (drawnSuit == topSuit || drawnRank== topRank) {
            return true; // Card matches either the suit or rank of top card
        }
        return false;

    }
    public Card getTopCard(){
        return cards.pop();
    }
    public void addCardToTop(Card card) {

        cards.push(card);
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public void setCards(Stack<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "DiscardPile{" +
                "cards=" + cards +
                '}';
    }

}
