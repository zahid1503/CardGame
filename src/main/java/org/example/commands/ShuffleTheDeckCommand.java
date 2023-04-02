package org.example.commands;

import org.example.services.IDeckService;

public class ShuffleTheDeckCommand implements ICommand{
    private final IDeckService deckService;

    public ShuffleTheDeckCommand(IDeckService deckService) {
        this.deckService = deckService;
    }

    @Override
    public void execute(String token) {

        try {
            deckService.shuffle();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
