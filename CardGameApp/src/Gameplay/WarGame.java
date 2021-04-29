/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class creates a new game of war between two players
 */
package Gameplay;

import CardDeck.CardDeck;
import CardDeck.Cards;
import java.util.ArrayList;

public class WarGame {

    CardDeck deck;
    String player1;
    String player2 = "computer";
    Cards player1Card;
    Cards player2Card;
    String gameWinner = "";
    String gameRoundWinner = "";
    ArrayList<GameRound> rounds = new ArrayList<>();
    final String WAR_PILE = "war";
    int player1Score;
    int player2Score;

    public WarGame(String player1) {
        this.player1 = player1;
        this.deck = new CardDeck();
        deck.halfDeck(player1, player2);

        this.player1Score = deck.getPileRemaining(player1);
        this.player2Score = deck.getPileRemaining(player2);

    }

    public WarGame(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        deck = new CardDeck();
        deck.halfDeck(player1, player2);
        this.player1Score = deck.getPileRemaining(player1);
        this.player2Score = deck.getPileRemaining(player2);

    }

    public String newGameRound(int roundNum) {

        GameRound gameRound = new GameRound(roundNum);
        rounds.add(gameRound);
        drawCards();
        //System.out.println(deck.getPileRemaining(WAR_PILE));
        compareCards();
        checkWinner();
        gameRound.setPlayer1Card(player1Card);
        gameRound.setPlayer2Card(player2Card);
        gameRound.setGameRoundWinner(gameRoundWinner);
        setPlayer1Score(deck.getPileRemaining(player1));
        setPlayer2Score(deck.getPileRemaining(player2));
        rounds.add(gameRound);
        if ("".equals(gameWinner)) {
            return getGameRoundWinner();
        }
        return getGameWinner();
    }

    public String newGameRoundAfterTie(int roundNum) {

        GameRound gameRound = new GameRound(roundNum);
        tie();
        drawCards();
        //System.out.println(deck.getPileRemaining(WAR_PILE));
        compareCards();
        checkWinner();
        gameRound.setPlayer1Card(player1Card);
        gameRound.setPlayer2Card(player2Card);
        gameRound.setGameRoundWinner(gameRoundWinner);
        setPlayer1Score(deck.getPileRemaining(player1));
        setPlayer2Score(deck.getPileRemaining(player2));
        rounds.add(gameRound);
        if ("".equals(gameWinner)) {
            return getGameRoundWinner();
        }
        return getGameWinner();
    }

    public void drawCards() {
        player1Card = deck.addToPileFromPile(player1, WAR_PILE);
        player2Card = deck.addToPileFromPile(player2, WAR_PILE);
    }

    public Cards compareCards() {

        switch (player1Card.compareTo(player2Card)) {
            case 0:
                gameRoundWinner = "tie, Draw Again!";
                return player1Card;
            case 1:
                gameRoundWinner = player1;
                cardsToWinner();
                return player1Card;
            default:
                gameRoundWinner = player2;
                cardsToWinner();
                return player2Card;
        }
    }

    public void cardsToWinner() {
        for (int i = CardDeck.getPileRemaining(WAR_PILE); i > 0; i--) {
            deck.addToPileFromPile(WAR_PILE, gameRoundWinner);
            //System.out.println("added card to " + gameRoundWinner);
        }
        deck.shufflePile(gameRoundWinner);

    }

    public void tie() {
        if (player1Score >= 4 && player2Score >= 4) {
            for (int i = 0; i < 3; i++) {
                deck.addToPileFromPile(player1, WAR_PILE);
                deck.addToPileFromPile(player2, WAR_PILE);
            }
        } else if (player1Score >= 4) {
            for (int i = 0; i < 3; i++) {
                deck.addToPileFromPile(player1, WAR_PILE);
            }
            for (int i = 0; i < player1Score - 1; i++) {
                deck.addToPileFromPile(player2, WAR_PILE);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                deck.addToPileFromPile(player2, WAR_PILE);
            }
            for (int i = 0; i < player1Score - 1; i++) {
                deck.addToPileFromPile(player1, WAR_PILE);
            }
        }
    }

    public String getGameRoundWinner() {
        return gameRoundWinner + " has won the round!";
    }

    public String getPlayer1CardImageFromRound(int roundNum) {
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getPlayer1Card().getCardImage();
    }

    public String getPlayer2CardImageFromRound(int roundNum) {
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getPlayer2Card().getCardImage();
    }

    public String getWinnerFromRound(int roundNum) {
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getGameRoundWinner();
    }

    public void checkWinner() {
        if (getPlayer1Score() == 0) {
            setGameWinner(player2);
        }
        if (getPlayer2Score() == 0) {
            setGameWinner(player1);
        }
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public String getGameWinner() {
        return gameWinner + "has won the game!";
    }

    public void setGameWinner(String gameWinner) {
        this.gameWinner = gameWinner;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public int getWAR_PILE() {
        return deck.getPileRemaining(WAR_PILE);
    }

}
