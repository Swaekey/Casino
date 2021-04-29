/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewControllers;

/**
 *
 * @author Serena Herter , Alana Traylor
 */
public class ControllerPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarGameController test = new WarGameController();
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
        
        UserDataController data = new UserDataController();
         data.addUserData("Paul2", "paul2", "test2@email.com", "002");
    }

}
