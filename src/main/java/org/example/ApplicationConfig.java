package org.example;

import org.example.commands.*;
import org.example.exceptions.NoSuchCommandException;
import org.example.repositories.DeckRepository;
import org.example.repositories.PlayerRepository;
import org.example.services.DeckService;
import org.example.services.GameService;
import org.example.services.PlayerService;

import java.io.IOException;
import java.util.Scanner;

public class ApplicationConfig {

    private final DeckRepository deckRepository = new DeckRepository();
    private final PlayerRepository playerRepository = new PlayerRepository();
    private final DeckService deckService = new DeckService(deckRepository);
    private final PlayerService playerService = new PlayerService(playerRepository);

    private final GameService gameService = new GameService(deckService,playerService);

    private final StartGameCommand startGameCommand = new StartGameCommand(gameService);
    private final ShuffleTheDeckCommand shuffleTheDeckCommand =
            new ShuffleTheDeckCommand(deckService);
    private final DealCardsToPlayersCommand dealCardsToPlayersCommand =
            new DealCardsToPlayersCommand(deckService);

    private final PlayCardCommand playCardCommand= new PlayCardCommand(gameService);
    private final DrawCardCommand drawCardCommand =
            new DrawCardCommand(gameService);
    private final SkipNextPlayerCommand skipNextPlayerCommand = new SkipNextPlayerCommand(gameService);

    private final ChangePlayOrderCommand changePlayOrderCommand = new ChangePlayOrderCommand(gameService);
    private final CommandInvoker commandInvoker = new CommandInvoker();


    public CommandInvoker getCommandInvoker() {

        commandInvoker.register("startGame", startGameCommand);
        commandInvoker.register("shuffle", shuffleTheDeckCommand);
        commandInvoker.register("dealCardsToPlayers", dealCardsToPlayersCommand);
        commandInvoker.register("playCard", playCardCommand);
        commandInvoker.register("drawCard", drawCardCommand);
        commandInvoker.register("reverse", changePlayOrderCommand);
        commandInvoker.register("skip", skipNextPlayerCommand);

        return commandInvoker;
    }

}
