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
        CardDeck test = new CardDeck();
        test.newDeck();
        
        Cards cardDrawn = test.drawCardFromDeck();
        System.out.println(cardDrawn.getCardCode());
        System.out.println(cardDrawn.getCardValue());
        System.out.println(cardDrawn.getCardImage());
        
    }
    
}
