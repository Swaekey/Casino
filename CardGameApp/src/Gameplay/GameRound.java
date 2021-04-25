/*
 * The Four Lokos
 * Created by: Serena Herter, Keshawn Posey, Srushti Honnnenahalli
 * Created on: 4/21/2021
 * This class creates a new game round in a game of war between two players
 */
package Gameplay;

import CardDeck.Cards;


public class GameRound {
    
    int roundNum;
    Cards player1Card;
    Cards player2Card;
    String gameRoundWinner;

    public GameRound(int roundNum, Cards player1Card, Cards player2Card, String gameRoundWinner) {
        this.roundNum = roundNum;
        this.player1Card = player1Card;
        this.player2Card = player2Card;
        this.gameRoundWinner = gameRoundWinner;
    }

    public GameRound(int roundNum) {
        this.roundNum = roundNum;
    }
    
    

    public Cards getPlayer1Card() {
        return player1Card;
    }

    public void setPlayer1Card(Cards player1Card) {
        this.player1Card = player1Card;
    }

    public Cards getPlayer2Card() {
        return player2Card;
    }

    public void setPlayer2Card(Cards player2Card) {
        this.player2Card = player2Card;
    }

    public String getGameRoundWinner() {
        return gameRoundWinner;
    }

    public void setGameRoundWinner(String gameRoundWinner) {
        this.gameRoundWinner = gameRoundWinner;
    }

    
        
}
