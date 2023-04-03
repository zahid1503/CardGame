package org.example.entities;

import java.util.ArrayList;
import java.util.Stack;

public class DiscardPile {
    private Stack<Card> cards;

    public DiscardPile() {
        cards= new Stack<>();
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

        return drawnSuit == topSuit || drawnRank == topRank; // Card matches either the suit or rank of top card

    }
    public Card getTopCard(){
        return cards.peek();
    }
    public void addCardToTop(Card card) {

        cards.push(card);
    }

    public String getCards() {
        String res = "";
        for (Card card: cards){
            res = res.concat(card.getSuit().getSymbol()+card.getRank().getRank()+" ");
        }
        return res;
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
