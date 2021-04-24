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
        System.out.println("deck: " + test.getDeckRemaining());
        System.out.println(test.drawCardFromDeck().toString());
        System.out.println("deck: " + test.getDeckRemaining());        
        System.out.println(test.drawCardFromDeck().toString());
        System.out.println("deck: " + test.getDeckRemaining());
        System.out.println(test.drawCardFromDeck().toString());
        System.out.println("deck: " + test.getDeckRemaining());
        System.out.println(test.addToPileFromDeck("mypile").toString());
        System.out.println("pile: " + test.getPileRemaining("mypile"));
        System.out.println("deck: " + test.getDeckRemaining());
        
       
        
    }
    
}
