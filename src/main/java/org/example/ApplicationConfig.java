package org.example;

import org.example.commands.*;
import org.example.repositories.DeckRepository;
import org.example.services.DeckService;
import org.example.services.GameService;

public class ApplicationConfig {

    private final DeckRepository deckRepository = new DeckRepository();
    private final DeckService deckService = new DeckService(deckRepository);
    private final GameService gameService = new GameService(deckService);
    private final StartGameCommand startGameCommand = new StartGameCommand(gameService);
    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker() {

        commandInvoker.register("S", startGameCommand);

        return commandInvoker;
    }

}
