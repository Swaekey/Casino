/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class creates a new game of war between two players
 */
package Gameplay;

import CardDeck.CardDeck;

import java.util.ArrayList;

public class WarGame {
    CardDeck deck;
    String player1;
    String player2 = "computer";
    String gameWinner = "";
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
    
    public String newGameRound(int roundNum){
        
        GameRound gameRound = new GameRound(player1, roundNum);        
        rounds.add(gameRound);
        gameRound.drawCards();
        gameRound.compareCards();
        setPlayer1Score(deck.getPileRemaining(player1));
        setPlayer2Score(deck.getPileRemaining(player2));
        checkWinner();
        if ("".equals(gameWinner)){
        return gameRound.getGameRoundWinner();
        }
        return getGameWinner();
    }
    
    public String newGameRoundAfterTie(int roundNum){
        
        GameRound gameRound = new GameRound(player1, roundNum);        
        rounds.add(gameRound);
        gameRound.tie();
        gameRound.drawCards();
        gameRound.compareCards();
        setPlayer1Score(deck.getPileRemaining(player1));
        setPlayer2Score(deck.getPileRemaining(player2));
        checkWinner();
        if ("".equals(gameWinner)){
        return gameRound.getGameRoundWinner();
        }
        return gameWinner;
    }
    
    
    public String getPlayer1CardImageFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getPlayer1CardImage();
    }
    
    public String getPlayer2CardImageFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getPlayer2CardImage();
    }
    
    public String getWinnerFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getGameRoundWinner();
    }
    
    
    public void checkWinner(){
        if (getPlayer1Score() == 0){
            setGameWinner(player2);
        }
        if (getPlayer2Score() == 0){
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
    
    
    
}
