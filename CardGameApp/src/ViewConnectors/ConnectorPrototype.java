/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewConnectors;

/**
 *
 * @author Serena
 */
public class ConnectorPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarGameConnector test = new WarGameConnector();
        test.startNewGame();
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        test.newRound();
        System.out.println(test.player1Score() + " to " + test.player2Score());
        test.p1();
        test.p2();
        System.out.println(test.winnerMessage());
        
        
    }
    
}
