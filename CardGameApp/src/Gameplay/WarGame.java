
package GamePlay;

import api.CardDeck;
import api.Cards;
/**
 *
 * @author Keshawn
 */

public class WarGame {
    CardDeck deck;
    String playerUserName;
    final String COMPUTER_USER_NAME = "computer";
    int playerScore;
    int computerScore;
    public WarGame(String playerUserName) {
        this.playerUserName = playerUserName;
        this.deck = new CardDeck();
        CardDeck.newDeck();        
        CardDeck.setPlayer1(playerUserName);
        CardDeck.halfDeck();
        this.playerScore = CardDeck.getPileRemaining(playerUserName);
        this.computerScore = CardDeck.getPileRemaining(COMPUTER_USER_NAME);
        
        Cards[][] hands = new Cards[2][1];
        CardDeck myDeck = new CardDeck();

        // 26 iterations because two cards are dealt each iteration
        for (int i = 0; i < 26; i++) {
            System.out.printf("\n Round %s of The War \n", i);

            //for (int c = 0; c < 1; c++)
            for (int player = 0; player < hands.length; player++) {
                hands[player][0] = CardDeck.drawCardFromDeck();
            }

            for (int player = 0; player < hands.length; player++) {
                System.out.printf("Player %d: ", player);
                printHand(hands[player]);
            }

            int player1 = hands[0][0].getCardValue(); //get the value from the Card object
            int player2 = hands[1][0].getCardValue();

            if (player1 > player2) {
                System.out.println("Player One Wins The War");
            } else if (player2 > player1) {
                System.out.println("Player Two Wins The War");
            } else {
                System.out.printf("Tie Game Its war", i);
            }

        }
    }

    public static void printHand(Cards[] _hand) {

        for (int card = 0; card < _hand.length; card++) {
            System.out.printf("%s", _hand[card].toString());
        }

        System.out.println();

    }
}
