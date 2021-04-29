/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDataBase;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Serena Herter, Alana Traylor, Srushti Honnenahalli
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

        userDB.addUserData("Serena Herter", "s_wish", "serena@email.com", "puppy21");
        userDB.addUserData("Gwen", "Admin", "admin@email.com", "password123");
        userDB.addUserData("peter", "cardPlayer", "peter.33@email", "1234");
        userDB.addUserData("peter", "cardPlayer", "peter.33@email.com", "1234");
        userDB.validateUserData("s_wish", "puppy21");
        userDB.validateUserDataLogic("s_wish", "puppy21");
        userDB.validateUserDataLogic("Admin", "password123");
        System.out.println(userDB.isUniqueUsername("Admin"));
        System.out.println(userDB.isUniqueUsername("admin"));
        System.out.println(userDB.getUserByUsername("Admin"));
        System.out.println(userDB.getUserByUsername("admin"));
        userDB.addUserData("Maria", "PuddleWart", "m.jones@email.com", "00");

    }

}
