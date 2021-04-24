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
    private static String deckID;
    private static String player1;
    protected static final String PLAYER_2 = "computer";
    
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
    public static void halfDeck(){
        api.CardDeckAPI.halfDeck();
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
    public static Cards addToPileFromPile(String pileFrom, String pileTo){
        return new Cards( api.CardDeckAPI.addToPileFromPile(pileFrom, pileTo));
    }
    
    public static void setPlayer1(String player1){
        api.CardDeckAPI.setPlayer1(player1);
    }
    
    
    
    
    
    
}
