package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards;

    public Deck(){
        this.cards = new Stack<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public Stack<Card> getCards() {
        return cards;
    }
}
