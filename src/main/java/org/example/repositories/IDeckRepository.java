package org.example.repositories;

import org.example.entities.Deck;

import java.util.List;

public interface IDeckRepository extends CRUDRepository<Deck,String> {
    @Override
    Deck save(Deck entity);

    @Override
    List<Deck> findAll();
}
