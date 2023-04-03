package org.example.services;

import org.example.entities.Card;
import org.example.entities.Hand;
import org.example.repositories.IDeckRepository;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckService implements IDeckService {
    private final IDeckRepository deckRepository;
    private List<Card> cards;
    public DeckService(IDeckRepository deckRepository) {
        this.deckRepository = deckRepository;
    }
    @Override
    public List<Card> getAllCards() {
        return deckRepository.findAll();
    }

    // Deal 5 cards to each player
    public void dealCardsToHands(List<Hand> hands) {
        for (Hand hand : hands) {
            for (int j = 0; j < 5; j++) {
                hand.addCardToHand(drawCard());
            }
        }
    }

    @Override
    public void shuffle() {
        cards = getAllCards();
        Collections.shuffle(cards,new Random());
    }

    @Override
    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty!");
        }

        return cards.remove(0);
    }

    @Override
    public void drawTwoCards(Hand hand) {
        for (int i = 0; i < 2; i++) {
            Card drawnCard = drawCard();
            hand.addCardToHand(drawnCard);
        }
    }
    @Override
    public void drawFourCards(Hand hand) {
        for (int i = 0; i < 4; i++) {
            Card drawnCard = drawCard();
            hand.addCardToHand(drawnCard);
        }
    }
}
