# Multiplayer Card Game in Java 

This is a Java implementation of a multiplayer card game that supports up to 4 players and different types of cards. The game follows the following rules:

Each player starts with a hand of 5 cards.
The game starts with a deck of 52 cards (a standard deck of playing cards).
Players take turns playing cards from their hand, following a set of rules that define what cards can be played when.
A player can only play a card if it matches either the suit or the rank of the top card on the discard pile.
If a player cannot play a card, they must draw a card from the draw pile. If the draw pile is empty, the game ends in a draw and no player is declared a winner.
The game ends when one player runs out of cards, who is declared the winner.


# Design Patterns
The solution makes use of the following design patterns:

Singleton: to ensure that there is only one instance of the deck and the game.
Command: to encapsulate the actions of the action cards, allowing for greater flexibility and reusability of code.
Entities


# The following entities are used in the solution:

Card: represents a playing card with a suit and rank.
Player: represents a player in the game with a hand of cards.
Deck: represents the deck of cards.
Game: represents the game and its state.
Rank: represents a playing card with rank attributes and methods.
Suit:  represents a playing card with Suit attributes and methods.


# Services and Repository
The following services and repository are used in the solution:

DeckService: provides a way to create a standard deck of cards and shuffle it.
GameService: provides methods to start and play the game.
PlayerService: provides methods to get players
DeckRepository: provides a way to access the deck of cards.
PlayerRepository : provides a way to access the list of players.

How to Use
To use the program, follow these steps:

Clone the repository to your local machine.
Open the project in your favorite Java IDE.
Build with gradle command "./gradlew build" and run the program ./gradlew run or run the main method .
Follow the on-screen instructions to play the game.

