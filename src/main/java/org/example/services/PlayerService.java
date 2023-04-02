package org.example.services;

import org.example.entities.Player;
import org.example.repositories.IPlayerRepository;

import java.util.List;
import java.util.Optional;

public class PlayerService implements IPlayerService{
    private IPlayerRepository playerRepository;

    public PlayerService(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
