package org.example.commands;

import org.example.services.IGameService;

public class StartGameCommand implements ICommand{
    private final IGameService gameService;

    public StartGameCommand(IGameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void execute(String token) {

        try {
            gameService.startGame();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}
