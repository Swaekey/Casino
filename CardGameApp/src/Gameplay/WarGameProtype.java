/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gameplay;


public class WarGameProtype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarGame test = new WarGame("player");
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(0));
        System.out.println(test.getPlayer1CardImageFromRound(0) + " to " + test.getPlayer2CardImageFromRound(0));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(1));
        System.out.println(test.getPlayer1CardImageFromRound(1) + " to " + test.getPlayer2CardImageFromRound(1));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(2));
        System.out.println(test.getPlayer1CardImageFromRound(2) + " to " + test.getPlayer2CardImageFromRound(2));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(3));
        System.out.println(test.getPlayer1CardImageFromRound(3) + " to " + test.getPlayer2CardImageFromRound(3));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(4));
        System.out.println(test.getPlayer1CardImageFromRound(4) + " to " + test.getPlayer2CardImageFromRound(4));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
        System.out.println(test.newGameRound(5));
        System.out.println(test.getPlayer1CardImageFromRound(5) + " to " + test.getPlayer2CardImageFromRound(5));
        System.out.println(test.getPlayer1Score() + " to " + test.getPlayer2Score());
    }
    
}
