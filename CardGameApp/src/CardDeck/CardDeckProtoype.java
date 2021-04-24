/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardDeck;

/**
 *
 * @author Serena
 */
public class CardDeckProtoype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardDeck test = new CardDeck();
        System.out.println("deck: " + test.getDeckRemaining());
        test.dealDeck("player1", "player2", "player3");
        System.out.println("deck: " + test.getDeckRemaining());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
        System.out.println(test.addToPileFromPile("player2", "player1").toString());
        System.out.println("player1: " + test.getPileRemaining("player1"));
        System.out.println("player2: " + test.getPileRemaining("player2"));
        System.out.println("player3: " + test.getPileRemaining("player3"));
    }
    
}
