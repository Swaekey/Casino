/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class translates information from the Deck of Cards API to be used thoughout the app
 * Creates new deck, Sets deckID, Shuffles deck, Draws card from deck, Keeps track of current number of cards in deck
 * Divides Deck into piles, Moves cards between piles, Draws card from pile, Keeps track of current number of cards in pile
 */
package CardDeck;

/**
 *
 * @author Serena
 */
public class CardDeck {

    public CardDeck() {
        newDeck();
    }    
    
    /**
     * creates new shuffled deck
     */
    public static void newDeck(){
        api.CardDeckAPI.newDeck();
    }
    
    /**
     * shuffles deck
     */
    public static void shuffle(){
        api.CardDeckAPI.shuffle();
    }
    
    /**
     * draws card from main deck
     * @return card drawn information
     */
    public static Cards drawCardFromDeck(){
       return new Cards(api.CardDeckAPI.drawCardFromDeck());
    }
    
    /**
     * counts remaining cards in main deck
     * @return main deck count
     */
    public static int getDeckRemaining(){
        return api.CardDeckAPI.getDeckRemaining();
    }
    
    /**
     * shuffles cards in pileName
     * @param pileName
     */
    public static void shufflePile(String pileName){
        api.CardDeckAPI.shufflePile(pileName);
    }
    
    /**
     * draws card from main deck and adds that card to pileName
     * @param pileName
     * @return the card added information
     */
    public static Cards addToPileFromDeck(String pileName){
        return new Cards(api.CardDeckAPI.addToPileFromDeck(pileName));
    }
    
    /**
     * splits the deck into two equal piles
     */
    public static void halfDeck(String pile1, String pile2){
        int pileSize = getDeckRemaining() / 2;

        for (int i = pileSize; i > 0; i--) {
            api.CardDeckAPI.addToPileFromDeck(pile1);
            api.CardDeckAPI.addToPileFromDeck(pile2);
        }
        
        if (getDeckRemaining() == 1){
            addToPileFromDeck(pile2);
        }
    }
    
    public static void dealDeck(String ... args){
        int pileSize = getDeckRemaining()/ args.length;
        for (int i = pileSize; i > 0; i--) {
            for (int j = args.length; j > 0; j--){
                api.CardDeckAPI.addToPileFromDeck(args[j-1]);
            }
        }
        if (getDeckRemaining() != 0){
           for (int i = getDeckRemaining(); i > 0; i--) {
                for (int j = getDeckRemaining(); j > 0; j--){
                    api.CardDeckAPI.addToPileFromDeck(args[j]);
                }
           } 
        }
    }
    
    /**
     * counts the remaining cards in pileName
     * @param pileName
     * @return pileName Count
     */
    public static int getPileRemaining(String pileName){
        return api.CardDeckAPI.getPileRemaining(pileName);
    }
    
    /**
     * draws card from pileName
     * @param pileName
     * @return drawn card information
     */
    public static Cards drawCardFromPile(String pileName){
        return new Cards(api.CardDeckAPI.drawCardFromPile(pileName));
    }
    
    /**
     * draws a card from pileFrom and adds it to pileTo
     * @param pileFrom
     * @param pileTo
     * @return card moved information
     */
    public Cards addToPileFromPile(String pileFrom, String pileTo){
        return new Cards( api.CardDeckAPI.addToPileFromPile(pileFrom, pileTo));
    }
    
    
}
