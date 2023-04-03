package org.example.services;

import org.example.entities.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameService implements IGameService{

    private final IDeckService deckService;
    private final DiscardPile discardPile;
    private Game game;
    private boolean skipNext = false;
    private GameStatus gameState;

    private Player winner;
    List<Hand> hands;

    public GameService(IDeckService deckService ) {
        this.deckService = deckService;
        discardPile = new DiscardPile();
        hands = new ArrayList<>();
    }

    @Override
    public void startGame() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose the number of players:");
        System.out.println("2 3 4");
        int numbers = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<numbers;i++){
            System.out.println("Enter player"+i+1+ " details:");
            System.out.println("Name:");
            String name = scan.nextLine();
            Hand hand = new Hand(i,name);
            hands.add(hand);
        }

        deckService.shuffle();
        System.out.println("Deck has been shuffled");

        // Deal 5 cards to each player
        deckService.dealCardsToHands(hands);
        System.out.println("Cards have been distributed");
        // Start the game with the top card from the deck as the initial discard pile card
        Card topCard = deckService.drawCard();
         discardPile.addCardToTop(topCard);

         System.out.println("Initial card has been placed on the discard pile");

        // Set the game state to active and start with the first player
        gameState = GameStatus.ACTIVE;

        game = new Game(hands,deckService.getAllCards(),0);

        Play();
    }

    void Play(){
        Scanner scan = new Scanner(System.in);
        while(gameState != GameStatus.OVER){
            Hand hand = getNextPlayer();
            System.out.println(discardPile.getCards());
            System.out.println(hand.getPlayerName()+" turn");
            System.out.println(hand.getCardsString());
            System.out.println("Please choose the card you want to place[1,2,3,4,5...]");
            int index = scan.nextInt();
            scan.nextLine();

            playCard(hand.getCards().get(index-1),hand);
        }
        System.out.println(winner.getPlayerName() + " is the winner!!!!");
    }
    @Override
    public void playCard(Card card,Hand hand)  {

        TurnDirection direction = TurnDirection.CLOCKWISE;

        if (!discardPile.canCardBePlayed(card)) {
             drawCard(hand);
             return;
        }

        hand.removeCardFromHand(card);
        discardPile.addCardToTop(card);

        switch (card.getRank()) {
            case ACE:
                skipNextPlayer();
                break;
            case KING:
                changePlayOrder(direction);
                break;
            case QUEEN:
                deckService.drawTwoCards(getNextPlayer());
                break;
            case JACK:
                deckService.drawFourCards(getNextPlayer());
                break;
            default:
                // Do nothing for non-action cards
        }


        if (hand.getCardSizeInHand() == 0) {
            gameState = GameStatus.OVER;
            winner = hand;
        }
    }
    @Override
    public void drawCard(Hand hand ) {

        Card drawnCard = deckService.drawCard();
        hand.addCardToHand(drawnCard);
    }

    int currentPlayerIndex =0;

    @Override
    public Hand getNextPlayer() {
        int size = game.getPlayersSize();
            switch (game.getDirection()) {
                case CLOCKWISE:
                    currentPlayerIndex = (currentPlayerIndex + (skipNext ? 2 : 1)) % size;
                    break;
                case COUNTER_CLOCKWISE:
                    currentPlayerIndex = (currentPlayerIndex - (skipNext ? 2 : 1));
                    break;
            }
            skipNext = false;
            return hands.get(currentPlayerIndex);

    }



    @Override
    public void changePlayOrder(TurnDirection turnDirection) {
        Collections.reverse(hands);
    }

    @Override
    public void skipNextPlayer() {
        skipNext = true;
    }

}
