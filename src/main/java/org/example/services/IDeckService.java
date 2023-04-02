package org.example.services;

import org.example.entities.Card;
import org.example.entities.Hand;

import java.util.*;

public interface IDeckService {
    List<Card> getAllCards();
    void dealCardsToHands(List<Hand> hands);
    void shuffle();
    Card drawCard();
    void drawTwoCards(Hand hand);
    void drawFourCards(Hand hand);
}
