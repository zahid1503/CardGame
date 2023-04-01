package org.example.services;

import org.example.entities.Card;

import java.util.*;

public interface IDeckService {
    List<Card> getAllCards();
    void shuffle();
    Card drawCard();
    boolean isEmpty();


}
