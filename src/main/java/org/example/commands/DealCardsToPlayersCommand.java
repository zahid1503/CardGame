package org.example.commands;

import org.example.entities.Hand;
import org.example.services.IDeckService;

import java.util.List;

public class DealCardsToPlayersCommand implements ICommand{
    private final IDeckService deckService;

    public DealCardsToPlayersCommand(IDeckService deckService) {
        this.deckService = deckService;
    }

    @Override
    public void execute(String token) {

        List<Hand> hands =null;
        try {
            deckService.dealCardsToHands(hands);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
