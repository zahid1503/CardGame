package org.example.repositories;

import org.example.entities.Player;

import java.util.List;

public interface IPlayerRepository extends CRUDRepository<Player,String> {
    @Override
    Player save(Player entity);

    @Override
    List<Player> findAll();
}
