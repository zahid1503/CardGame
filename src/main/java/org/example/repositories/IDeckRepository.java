package org.example.repositories;

import org.example.entities.Card;
import org.example.entities.Deck;

import java.util.List;

public interface IDeckRepository {
    List<Card> findAll();

}
