package prototype;

import test2.UserTranslator;

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
        userDB.addUserData("Serena Herter", "s_wish", "serena@email.com", "puppy21");
        userDB.checkLines();
        userDB.addUserData("Gwen", "Admin", "admin@email.com", "password123");
        userDB.checkLines();
        userDB.addUserData("peter", "cardPlayer", "peter.33@email.com", "1234");
        userDB.validateUserData("s_wish", "puppy21");
        userDB.validateUserData("Admin", "password123");
        
//   String email = "john123@gmail.com";
//      System.out.println("The E-mail ID is: " + email);
//    System.out.println("Is the above E-mail ID valid? " + userDB.);
    }    
   
   
      
   
}
