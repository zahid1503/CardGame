package org.example.repositories;

import org.example.entities.Deck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeckRepository implements IDeckRepository{
    private final Map<String, Deck> deckMap;


    public DeckRepository(){
        deckMap = new HashMap<String,Deck>();
    }

    public DeckRepository(Map<String, Deck> deckMap) {
        this.deckMap = deckMap;
    }

    @Override
    public Deck save(Deck entity) {
        return null;
    }

    @Override
    public List<Deck> findAll() {
        return deckMap.values().stream().collect(Collectors.toList());
    }
}
