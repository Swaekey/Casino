/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class creates a new game round in a game of war between two players
 */
package Gameplay;

import CardDeck.CardDeck;
import CardDeck.Cards;


public class GameRound extends WarGame {
    
    int roundNum;
    Cards player1Card;
    Cards player2Card;
    String gameRoundWinner;

    public GameRound(String player1, int roundNum) {
        super(player1);
        this.roundNum = roundNum;
    }
    
    
    public void drawCards(){
        player1Card = deck.addToPileFromPile(player1, WAR_PILE);
        player2Card = deck.addToPileFromPile(player2, WAR_PILE);        
    }
    
    public Cards compareCards(){       
        
        switch (player1Card.compareTo(player2Card)) {
            case 0:
                gameRoundWinner = "tie";
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
    
    //NOT WORKING!!!
    public void cardsToWinner(){
        for (int i = 0; i <= CardDeck.getPileRemaining(WAR_PILE); i++){
            deck.addToPileFromPile(WAR_PILE, gameRoundWinner);
            System.out.println("added card to " + gameRoundWinner);
        }
            
    }
    
    public void tie(){
        if (player1Score >= 4 && player2Score >= 4){
            for (int i = 0; i < 3; i ++){
                    deck.addToPileFromPile(player1, WAR_PILE);
                    deck.addToPileFromPile(player2, WAR_PILE);
                }
        }
        else if (player1Score >= 4){
            for (int i = 0; i < 3; i ++){
                    deck.addToPileFromPile(player1, WAR_PILE);                    
                }
            for (int i = 0; i < player1Score - 1; i ++){
                    deck.addToPileFromPile(player2, WAR_PILE);                    
                }
        }
        else {
            for (int i = 0; i < 3; i ++){
                    deck.addToPileFromPile(player2, WAR_PILE);                    
                }
            for (int i = 0; i < player1Score - 1; i ++){
                    deck.addToPileFromPile(player1, WAR_PILE);                    
                }
        }
    }

    public String getGameRoundWinner() {
        return gameRoundWinner + " has won the round!";
    }   

    public Cards getPlayer1Card() {
        return player1Card;
    }

    public Cards getPlayer2Card() {
        return player2Card;
    }
    
    public String getPlayer1CardImage() {
        return player1Card.getCardImage();
    }

    public String getPlayer2CardImage() {
        return player2Card.getCardImage();
    }
        
}
