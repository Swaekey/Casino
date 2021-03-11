package Models;

import API.DatabaseApiTranslator;
import API.ApiInterface;

/**
 * this Deck class handles all functionality related to a deck of cards.
 *
 */

public class Deck {
    protected int deck_id;
    protected String name;
    // here we designate the translator that we want to use. The OpenDatabaseAPITranslator.
    protected final static ApiInterface CasinoAPI = new DatabaseApiTranslator();

    public void Deck() {}

    public int getId() {

        return this.deck_id;
    }

    public void setId(int deck_id) {

        this.deck_id = deck_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    /**
     *
     */
    public static Deck Shuffle(int _cards){
        Deck deckOfCards = new Deck();
        deckOfCards.setId(_cards);
        String newDeckOfCards = Deck.CasinoAPI.Shuffle(_cards);
        if( newDeckOfCards == null){
            return null;
        }
        deckOfCards.setName(newDeckOfCards);
        return deckOfCards;
    }
}
