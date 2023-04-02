package org.example.repositories;

import org.example.entities.Card;
import org.example.entities.Deck;

import java.util.List;

public interface IDeckRepository extends CRUDRepository<Card,String> {
    @Override
    Card save(Card entity);

    @Override
    List<Card> findAll();

}
