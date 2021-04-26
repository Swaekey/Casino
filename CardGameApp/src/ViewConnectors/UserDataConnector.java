/*
 * The Four Lokos
 * Created by: Alana Traylor
 * Created on: 4/26/21
 * This class connects the UserTranslator class to the view
 */
package ViewConnectors;

import java.util.Date;

public class UserDataConnector {

    static String UserID, Name, Username, Email, Password;
    static Date date;
    static int GamesPlayed, GamesWon;

    public UserDataConnector() {
    }

    public static String getUserID() {
        return UserID;
    }

    public static void setUserID(String UserID) {
        UserDataConnector.UserID = UserID;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        UserDataConnector.Name = Name;
    }

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String Username) {
        UserDataConnector.Username = Username;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        UserDataConnector.Email = Email;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        UserDataConnector.Password = Password;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        UserDataConnector.date = date;
    }

    public static int getGamesPlayed() {
        return GamesPlayed;
    }

    public static void setGamesPlayed(int GamesPlayed) {
        UserDataConnector.GamesPlayed = GamesPlayed;
    }

    public static int getGamesWon() {
        return GamesWon;
    }

    public static void setGamesWon(int GamesWon) {
        UserDataConnector.GamesWon = GamesWon;
    }
    
    

}
