/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gameplay;

import CardDeck.CardDeck;
import CardDeck.Cards;
import java.util.ArrayList;

public class WarGame {
    CardDeck deck;
    String playerUserName;
    String gameWinner = "";
    ArrayList<GameRound> rounds = new ArrayList<>();
    final String COMPUTER_USER_NAME = "computer";
    final String WAR_PILE = "war";
    int playerScore;
    int computerScore;
    

    public WarGame(String playerUserName) {
        this.playerUserName = playerUserName;
        this.deck = new CardDeck();
        
        deck.newDeck();        
        deck.setPlayer1(playerUserName);
        deck.halfDeck();
        
        this.playerScore = deck.getPileRemaining(playerUserName);
        this.computerScore = deck.getPileRemaining(COMPUTER_USER_NAME);
        
    }
    
    
    public String newGameRound(int roundNum){
        
        GameRound gameRound = new GameRound(playerUserName, roundNum);        
        rounds.add(gameRound);
        gameRound.drawCards();
        gameRound.compareCards();
        if (!"tie".equals(gameRound.getGameRoundWinner())){
        gameRound.cardsToWinner(gameRound.getGameRoundWinner());
        }
        setPlayerScore(deck.getPileRemaining(playerUserName));
        setComputerScore(deck.getPileRemaining(COMPUTER_USER_NAME));
        checkWinner();
        if ("".equals(gameWinner)){
        return gameRound.getGameRoundWinner();
        }
        return getGameWinner();
    }
    
    public String newGameRoundAfterTie(int roundNum){
        
        GameRound gameRound = new GameRound(playerUserName, roundNum);        
        rounds.add(gameRound);
        gameRound.tie();
        gameRound.drawCards();
        gameRound.compareCards();
        if (!"tie".equals(gameRound.getGameRoundWinner())){
        gameRound.cardsToWinner(gameRound.getGameRoundWinner());
        }
        setPlayerScore(deck.getPileRemaining(playerUserName));
        setComputerScore(deck.getPileRemaining(COMPUTER_USER_NAME));
        if ("".equals(gameWinner)){
        return gameRound.getGameRoundWinner();
        }
        return gameWinner;
    }
    
    
    public String getPlayerCardImageFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getPlayerCardImage();
    }
    
    public String getComputerCardImageFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getComputerCardImage();
    }
    
    public String getWinnerFromRound(int roundNum){
        GameRound gameRound = rounds.get(roundNum);
        return gameRound.getGameRoundWinner();
    }
    
    
    public void checkWinner(){
        if (getPlayerScore() == 0){
            setGameWinner(COMPUTER_USER_NAME);
        }
        if (getComputerScore() == 0){
            setGameWinner(playerUserName);
        }
    }
    

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public String getGameWinner() {
        return gameWinner + "has won the game!";
    }

    public void setGameWinner(String gameWinner) {
        this.gameWinner = gameWinner;
    }
    
    
    
    
    
}
