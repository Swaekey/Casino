
package Gameplay;

import CardDeck.CardDeck;
import CardDeck.Cards;


public class GameRound extends WarGame {
    
    int roundNum;
    Cards playerCard;
    Cards computerCard;
    String gameRoundWinner;
    
    public GameRound(String playerUserName, int roundNum) {
        super(playerUserName);
        this.roundNum = roundNum;
    }
    
    public void drawCards(){
        this.playerCard = CardDeck.addToPileFromPile(playerUserName, WAR_PILE);
        this.computerCard = CardDeck.addToPileFromPile(COMPUTER_USER_NAME, WAR_PILE);        
    }
    
    public Cards compareCards(){       
        
        switch (playerCard.compareTo(computerCard)) {
            case 0:
                gameRoundWinner = "tie";
                return playerCard;                
            case 1:
                gameRoundWinner = playerUserName;
                return playerCard;
            default:
                gameRoundWinner = COMPUTER_USER_NAME;
                return computerCard;
        }
    }
    
    public void cardsToWinner(String winner){
        for (int i = 0; i < CardDeck.getPileRemaining(WAR_PILE); i++){
            deck.addToPileFromPile(WAR_PILE, winner);
        }
            
    }
    
    public void tie(){
        if (playerScore >= 4 && computerScore >= 4){
            for (int i = 0; i < 3; i ++){
                    CardDeck.addToPileFromPile(playerUserName, WAR_PILE);
                    CardDeck.addToPileFromPile(COMPUTER_USER_NAME, WAR_PILE);
                }
        }
        else if (playerScore >= 4){
            for (int i = 0; i < 3; i ++){
                    CardDeck.addToPileFromPile(playerUserName, WAR_PILE);                    
                }
            for (int i = 0; i < computerScore - 1; i ++){
                    CardDeck.addToPileFromPile(COMPUTER_USER_NAME, WAR_PILE);                    
                }
        }
        else {
            for (int i = 0; i < 3; i ++){
                    CardDeck.addToPileFromPile(COMPUTER_USER_NAME, WAR_PILE);                    
                }
            for (int i = 0; i < playerScore - 1; i ++){
                    CardDeck.addToPileFromPile(playerUserName, WAR_PILE);                    
                }
        }
    }

    public String getGameRoundWinner() {
        return gameRoundWinner + "has won the round!";
    }   

    public Cards getPlayerCard() {
        return playerCard;
    }

    public Cards getComputerCard() {
        return computerCard;
    }
    
    public String getPlayerCardImage() {
        return playerCard.getCardImage();
    }

    public String getComputerCardImage() {
        return computerCard.getCardImage();
    }
        
}
