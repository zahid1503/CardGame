package org.example.repositories;

import org.example.entities.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerRepository implements IPlayerRepository{

    private final Map<String,Player> playerMap;
    private Integer autoIncrement = 0;

    public PlayerRepository(){
        playerMap = new HashMap<String,Player>();
    }

    public PlayerRepository(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
        this.autoIncrement = playerMap.size();
    }

    @Override
    public Player save(Player entity) {
        return null;
    }

    @Override
    public List<Player> findAll() {
        return playerMap.values().stream().collect(Collectors.toList());
    }
}
