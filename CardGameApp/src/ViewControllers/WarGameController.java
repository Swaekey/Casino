/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/24/2021
 * This class connects the WarGame class to the view
 */
package ViewControllers;

import Gameplay.WarGame;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class WarGameController {

    static int numRounds = 0;
    WarGame newGame;
    static String player = UserDataController.Username;
    static int gamesplayed = 0;

    //startNewGame
    public WarGame startNewGame() {
        newGame = new WarGame(player);
        numRounds = 0;
        gamesplayed++;
        return newGame;
    }

    //newRound
    public void newRound() {

        if (numRounds > 0 && "tie".equals(newGame.getWinnerFromRound(numRounds - 1))) {
            newGame.newGameRoundAfterTie(numRounds);
        } else {
            newGame.newGameRound(numRounds);
        }
        numRounds++;
    }

    //update Player1Image
    public Icon player1Image() throws MalformedURLException, IOException {
        URL url = new URL(newGame.getPlayer1CardImageFromRound(numRounds));
        Image image = ImageIO.read(url);
        ImageIcon icon = new ImageIcon(image);
        return icon;
    }

    public void p1() {
        System.out.println(newGame.getPlayer1CardImageFromRound(numRounds));
    }

    public void p2() {
        System.out.println(newGame.getPlayer2CardImageFromRound(numRounds));
    }

    //update Player2Image
    public Icon player2Image() throws MalformedURLException, IOException {

        URL url = new URL(newGame.getPlayer2CardImageFromRound(numRounds));
        Image image = ImageIO.read(url);
        ImageIcon icon = new ImageIcon(image);
        return icon;
    }

    //updatePlayer1Score
    public String player1Score() {
        return Integer.toString(newGame.getPlayer1Score());
    }

    //updatePlayer2Score
    public String player2Score() {
        return Integer.toString(newGame.getPlayer2Score());
    }

    //WinnerMessage
    public String winnerMessage() {
        return newGame.getGameRoundWinner();
    }

    public String getGamesplayed() {
        return Integer.toString(gamesplayed);
    }

    public static void setGamesplayed(int gamesplayed) {
        WarGameController.gamesplayed = gamesplayed;
    }

    public String getNumRounds() {
        return Integer.toString(numRounds);
    }

    public static void setNumRounds(int numRounds) {
        WarGameController.numRounds = numRounds;
    }

}
