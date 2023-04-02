package org.example.repositories;

import org.example.entities.Card;
import org.example.entities.Deck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeckRepository implements IDeckRepository{
    private final Map<String, Card> cardMap;


    public DeckRepository(){
        cardMap = new HashMap<String,Card>();
    }

    public DeckRepository(Map<String, Card> cardMap) {
        this.cardMap = cardMap;
    }

    @Override
    public Card save(Card entity) {
        return null;
    }

    @Override
    public List<Card> findAll() {
        return cardMap.values().stream().collect(Collectors.toList());
    }
}
