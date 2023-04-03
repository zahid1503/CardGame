package org.example.repositories;

import org.example.entities.Card;
import org.example.entities.Deck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckRepository implements IDeckRepository{
    public DeckRepository(){}

    @Override
    public List<Card> findAll() {
        return  new Deck().getCards();
    }
}
