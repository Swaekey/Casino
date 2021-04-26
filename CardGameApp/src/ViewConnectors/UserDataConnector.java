/*
 * The Four Lokos
 * Created by: Alana Traylor, Serena Herter
 * Created on: 4/26/21
 * This class connects the UserTranslator class to the view
 */
package ViewConnectors;

import UserDataBase.UserTranslator;
import java.util.Date;

public class UserDataConnector extends UserTranslator {

    public static String Name, Email, Password;
    static String Username = "player";
    public Date date;
    public int GamesPlayed, GamesWon;

    public UserDataConnector(String Name, String Username, String Email, String Password) {
        super(Name, Username, Email, Password);
        
        this.date = date;
        this.GamesPlayed = GamesPlayed;
        this.GamesWon = GamesWon;

    }
    
    public void addData(){
        super.addUserData(Name, Username, Email, Password);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGamesPlayed() {
        return GamesPlayed;
    }

    public void setGamesPlayed(int GamesPlayed) {
        this.GamesPlayed = GamesPlayed;
    }

    public int getGamesWon() {
        return GamesWon;
    }

    public void setGamesWon(int GamesWon) {
        this.GamesWon = GamesWon;
    }
    
    

}
