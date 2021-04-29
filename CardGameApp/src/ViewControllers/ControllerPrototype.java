/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewControllers;

/**
 *
 * @author Serena
 */
public class ControllerPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        WarGameConnector test = new WarGameConnector();
//        test.startNewGame();
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
//        test.newRound();
//        System.out.println(test.player1Score() + " to " + test.player2Score());
//        test.p1();
//        test.p2();
//        System.out.println(test.winnerMessage());
        
          UserDataController data = new UserDataController();
          data.addUserData("testplayer2", "test2", "test123@gmail.com", "1");
          if(data.validateUserData("Admin", "password123")){
              System.out.println("winner");
          }

        
    }
    
}
