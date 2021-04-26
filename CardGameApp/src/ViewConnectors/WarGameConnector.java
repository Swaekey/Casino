/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/24/2021
 * This class connects the WarGame class to the view
 */
package ViewConnectors;

import Gameplay.WarGame;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class WarGameConnector {

    static int numRounds = 0;
    WarGame newGame;
    String player = UserDataConnector.Username;

    //startNewGame
    public WarGame startNewGame() {
        newGame = new WarGame(player);
        numRounds = 0;
        //set player games played ++
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

}
