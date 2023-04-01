package org.example.services;

import org.example.entities.Player;
import java.util.*;

public interface IPlayerService {
    List<Player> getAllPlayers();
    Player getPlayerByName();
    void addPlayer();

    void removePlayer();

}
