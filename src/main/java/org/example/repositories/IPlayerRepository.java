package org.example.repositories;

import org.example.entities.Player;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IPlayerRepository extends CRUDRepository<Player,String> {


    @Override
    Player save(Player entity);

    @Override
    List<Player> findAll();


    public Optional<Player> findByName(Player name) ;

}
