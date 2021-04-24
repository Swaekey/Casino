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
        System.out.println("player's score: "  + test.getPlayerScore());
        System.out.println("Computer's score: " + test.getComputerScore());
        
        System.out.println(test.newGameRound(0));
        
        
        System.out.println("player's score: " + test.getPlayerScore());
        System.out.println("Computer's score: " + test.getComputerScore());
    }
    
}
