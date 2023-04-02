package org.example.commands;

import org.example.entities.Hand;
import org.example.entities.Player;
import org.example.services.IGameService;

public class DrawCardCommand  implements ICommand{
    private final IGameService gameService;

    public DrawCardCommand(IGameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void execute(String token) {
        Hand hand =null;
        Player player = null;
        try {
            gameService.drawCard(hand , player);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
