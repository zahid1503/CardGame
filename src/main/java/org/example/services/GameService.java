package org.example.services;

import org.example.entities.*;
import org.example.exceptions.InvalidCardException;
import org.example.exceptions.PlayerNotFoundException;

import java.util.List;


public class GameService implements IGameService{

    private IDeckService deckService;
    private IPlayerService playerService;
    private DiscardPile discardPile;
    private Game game;
    private List<Player> listOfPlayers;
    private boolean skipNext = false;
    private GameStatus gameState;

    private Player winner;

    public GameService(IDeckService deckService, IPlayerService playerService) {
        this.deckService = deckService;
        this.playerService = playerService;
        discardPile = new DiscardPile();

    }

    @Override
    public void startGame() {

        List<Hand> hands= null;
        deckService.shuffle();

        // Deal 5 cards to each player
        deckService.dealCardsToHands(hands);

        // Start the game with the top card from the deck as the initial discard pile card
        Card topCard = deckService.drawCard();
        discardPile.addCardToTop(topCard);

        // Set the game state to active and start with the first player
        gameState = gameState.ACTIVE;
        game.getCurrentPlayerIndex();
    }

    @Override
    public void playCard(Player player, Card card,Hand hand)  {

        TurnDirection direction = TurnDirection.CLOCKWISE;

        if (!discardPile.canCardBePlayed(card)) {
             drawCard(hand, player);
        }

        hand.removeCardFromHand(card);
        discardPile.addCardToTop(card);

        switch (card.getRank()) {
            case ACE:
                skipNextPlayer(player);
                break;
            case KING:
                changePlayOrder(listOfPlayers, direction);
                break;
            case QUEEN:
                deckService.drawTwoCards(hand);
                break;
            case JACK:
                deckService.drawFourCards(hand);
                break;
            default:
                // Do nothing for non-action cards
        }


        if (hand.getCardSizeInHand() == 0) {
            gameState = gameState.OVER;
            winner = player;
        }

        getNextPlayer();
    }

    @Override
    public void drawCard(Hand hand , Player player) {

        Card drawnCard = deckService.drawCard();
        hand.addCardToHand(drawnCard);

        getNextPlayer();
    }

    int currentPlayerIndex =0;

    @Override
    public Player getNextPlayer() {

        TurnDirection direction = null;
        int size = game.getPlayersSize();
        Player nextPlayer = null;
            switch (direction) {
            case CLOCKWISE:
                currentPlayerIndex = (currentPlayerIndex + (skipNext ? 2 : 1)) % size;
                break;
                case COUNTER_CLOCKWISE:
                    currentPlayerIndex = (currentPlayerIndex - (skipNext ? 2 : 1)) + size % size;
                    break;
            }
            skipNext = false;
            nextPlayer = listOfPlayers.get(currentPlayerIndex);
            return nextPlayer;

    }



    @Override
    public void changePlayOrder(List<Player> players, TurnDirection turnDirection) {

        if (turnDirection == TurnDirection.CLOCKWISE) {

            Player firstPlayer = players.remove(0);
            players.add(firstPlayer);
        } else {

            Player lastPlayer = players.remove(players.size() - 1);
            players.add(0, lastPlayer);
        }
    }

    @Override
    public void skipNextPlayer(Player player) {
        skipNext = true;
    }

}
