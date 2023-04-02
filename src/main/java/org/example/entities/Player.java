package org.example.entities;
import java.util.*;

public class Player {

    private String id;
    private String playerName;
    private Hand hand;
    private TurnDirection direction;
    private int currentPlayerIndex ;


    public Player(String id, String playerName, Hand hand, TurnDirection direction) {
        this.id = id;
        this.playerName = playerName;
        this.hand = hand;
        this.direction = direction;
    }

    public Player(String id, String playerName) {
        this.id = id ;
        this.playerName = playerName;

    }

    public String getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
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
        return Objects.equals(getPlayerName(), player.getPlayerName()) && Objects.equals(getHand(), player.getHand()) && getDirection() == player.getDirection();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerName(), getHand(), getDirection());
    }
}
