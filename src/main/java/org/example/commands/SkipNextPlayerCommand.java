package org.example.commands;

import org.example.entities.Player;
import org.example.entities.TurnDirection;
import org.example.services.IGameService;

import java.util.List;

public class SkipNextPlayerCommand implements ICommand{
    private final IGameService gameService;

    public SkipNextPlayerCommand(IGameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void execute(String token) {
        Player player = null;
        try {
            gameService.skipNextPlayer(player);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
