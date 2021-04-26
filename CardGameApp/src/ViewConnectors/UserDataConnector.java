/*
 * The Four Lokos
 * Created by: Alana Traylor
 * Created on: 4/26/21
 * This class connects the UserTranslator class to the view
 */
package ViewConnectors;

public class UserDataConnector {
    public String UserID, Name, Username, Email, Password;
    public Date date;
    public int GamesPlayed, GamesWon;

    public UserDataConnector(String userID, String name, String username, String email, String password, Date date, int gamesPlayed, int gamesWon) {
        UserID = userID;
        Name = name;
        Username = username;
        Email = email;
        Password = password;
        this.date = date;
        GamesPlayed = gamesPlayed;
        GamesWon = gamesWon;
    }

    //get and set UserID

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    //get snd set Name

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //get and set UserName

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    //get and set Email

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    //get and set Password

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    //get and set CreatedDate

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //get and set GamesPlayed

    public int getGamesPlayed() {
        return GamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        GamesPlayed = gamesPlayed;
    }

    //get and set GamesWon

    public int getGamesWon() {
        return GamesWon;
    }

    public void setGamesWon(int gamesWon) {
        GamesWon = gamesWon;
    }


}
