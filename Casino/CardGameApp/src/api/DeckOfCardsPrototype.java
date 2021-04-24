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
        CardDeckAPI test = new CardDeckAPI();
        test.newDeck();
        test.setPlayer1("name");
        System.out.println("deck: " + test.getDeckRemaining());
        test.addToPileFromDeck("name");
        test.halfDeck();
        System.out.println("deck: " + test.getDeckRemaining());
        System.out.println("pile comp: " + test.getPileRemaining("computer"));
        System.out.println("pile player: " + test.getPileRemaining("name"));
        
       
        
    }
    
}
