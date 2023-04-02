package org.example.commands;

import org.example.entities.Player;
import org.example.entities.TurnDirection;
import org.example.services.IGameService;

import java.util.List;

public class ChangePlayOrderCommand  implements ICommand{
    private final IGameService gameService;

    public ChangePlayOrderCommand(IGameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void execute(String token) {
        List<Player> list =null;
        TurnDirection direction= null;
        try {
            gameService.changePlayOrder(list,direction);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
