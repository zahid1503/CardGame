package org.example.entities;
import java.util.*;

public class Player {

    private Integer id;
    private String playerName;
    private TurnDirection direction;
    private int currentPlayerIndex ;


    public Player(Integer id, String playerName,TurnDirection direction) { // Hand hand,
        this.id = id;
        this.playerName = playerName;
        this.direction = direction;
    }

    public Player(Integer id, String playerName) {
        this.id = id ;
        this.playerName = playerName;

    }

    public Integer getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public TurnDirection getDirection() {
        return direction;
    }

    public void setDirection(TurnDirection direction) {
        this.direction = direction;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(getPlayerName(), player.getPlayerName()) && getDirection() == player.getDirection(); // Objects.equals(getHand(), player.getHand())
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerName(),  getDirection()); //getHand(),
    }
}
