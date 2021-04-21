/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

/**
 *
 * @author Serena
 */
public class DeckOfCardsPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeckOfCardsAPI test = new DeckOfCardsAPI();
        test.newDeck();
        System.out.println(test.getDeckRemaining());
        test.halfDeck();
        System.out.println(test.getDeckRemaining());
        System.out.println("player1 = " + test.getPileRemaining("player1"));        
        System.out.println("player2 = " + test.getPileRemaining("player2"));
        test.addToPileFromPile("player1", "player2");
        System.out.println("player1 = " + test.getPileRemaining("player1"));
        System.out.println("player2 = " + test.getPileRemaining("player2"));
        
    }
    
}
