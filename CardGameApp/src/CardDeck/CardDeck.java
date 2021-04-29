package CardDeck;

/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class translates information from the Deck of Cards API to be used thoughout the app
 * Creates new deck, Sets deckID, Shuffles deck, Draws card from deck, Keeps track of current number of cards in deck
 * Divides Deck into piles, Moves cards between piles, Draws card from pile, Keeps track of current number of cards in pile
 */
public class CardDeck {

    public CardDeck() {
        newDeck();
    }

    /**
     * creates new shuffled deck
     */
    public static void newDeck() {
        apiTranslators.CardDeckAPITranslator.newDeck();
    }

    /**
     * shuffles deck
     */
    public static void shuffle() {
        apiTranslators.CardDeckAPITranslator.shuffle();
    }

    /**
     * draws card from main deck
     *
     * @return card drawn information
     */
    public static Cards drawCardFromDeck() {
        return new Cards(apiTranslators.CardDeckAPITranslator.drawCardFromDeck());
    }

    /**
     * counts remaining cards in main deck
     *
     * @return main deck count
     */
    public static int getDeckRemaining() {
        return apiTranslators.CardDeckAPITranslator.getDeckRemaining();
    }

    /**
     * shuffles cards in pileName
     *
     * @param _pileName
     */
    public static void shufflePile(String _pileName) {
        apiTranslators.CardDeckAPITranslator.shufflePile(_pileName);
    }

    /**
     * draws card from main deck and adds that card to pileName
     *
     * @param _pileName
     * @return the card added information
     */
    public static Cards addToPileFromDeck(String _pileName) {
        return new Cards(apiTranslators.CardDeckAPITranslator.addToPileFromDeck(_pileName));
    }

    /**
     * splits the deck into two equal piles
     */
    public static void halfDeck(String _pile1, String _pile2) {
        int pileSize = getDeckRemaining() / 2;

        for (int i = pileSize; i > 0; i--) {
            apiTranslators.CardDeckAPITranslator.addToPileFromDeck(_pile1);
            apiTranslators.CardDeckAPITranslator.addToPileFromDeck(_pile2);
        }

        if (getDeckRemaining() == 1) {
            addToPileFromDeck(_pile2);
        }
    }

    /**
     * divides the entire deck into piles
     *
     * @param args
     */
    public static void dealDeck(String... args) {
        int pileSize = getDeckRemaining() / args.length;
        for (int i = pileSize; i > 0; i--) {
            for (int j = args.length; j > 0; j--) {
                apiTranslators.CardDeckAPITranslator.addToPileFromDeck(args[j - 1]);
            }
        }
        if (getDeckRemaining() != 0) {
            for (int i = getDeckRemaining(); i > 0; i--) {
                for (int j = getDeckRemaining(); j > 0; j--) {
                    apiTranslators.CardDeckAPITranslator.addToPileFromDeck(args[j]);
                }
            }
        }
    }

    /**
     * counts the remaining cards in pileName
     *
     * @param _pileName
     * @return pileName Count
     */
    public static int getPileRemaining(String _pileName) {
        return apiTranslators.CardDeckAPITranslator.getPileRemaining(_pileName);
    }

    /**
     * draws card from pileName
     *
     * @param _pileName
     * @return drawn card information
     */
    public static Cards drawCardFromPile(String _pileName) {
        return new Cards(apiTranslators.CardDeckAPITranslator.drawCardFromPile(_pileName));
    }

    /**
     * draws a card from pileFrom and adds it to pileTo
     *
     * @param _pileFrom
     * @param _pileTo
     * @return card moved information
     */
    public Cards addToPileFromPile(String _pileFrom, String _pileTo) {
        return new Cards(apiTranslators.CardDeckAPITranslator.addToPileFromPile(_pileFrom, _pileTo));
    }

}
