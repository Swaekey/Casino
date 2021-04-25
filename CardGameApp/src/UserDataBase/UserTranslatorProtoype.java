/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDataBase;

/**
 *
 * @author Serena
 */
public class UserTranslatorProtoype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserTranslator userDB = new UserTranslator();
        userDB.createFolder();
        userDB.readFile(); 
        userDB.checkLines();
        //.addUserData("Serena Herter", "s_wish", "serena@email.com", "puppy21");
        userDB.checkLines();
        //userDB.addUserData("Gwen", "Admin", "admin@email.com", "password123");
        userDB.checkLines();
        //userDB.addUserData("peter", "cardPlayer", "peter.33@email.com", "1234");
        userDB.validateUserData("s_wish", "puppy21");
        userDB.validateUserData("Admin", "password123");
        
    }
    
}
