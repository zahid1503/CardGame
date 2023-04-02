package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Deck {
    private List<Card> cards;
    private Random random;

    public Deck(){
        this.cards = new ArrayList<>();
        this.random = new Random();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }
}
