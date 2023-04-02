package org.example.commands;

import org.example.entities.Card;
import org.example.entities.Hand;
import org.example.entities.Player;
import org.example.services.IGameService;

public class PlayCardCommand  implements ICommand{
    private final IGameService gameService;

    public PlayCardCommand(IGameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void execute(String token) {
        Player player = null;
        Card card =null;
        Hand hand = null;

        try {
            gameService.playCard(player, card,hand);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
