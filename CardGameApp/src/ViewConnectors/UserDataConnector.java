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

    public UserDataConnector() {
    }
    

    public void addData() {
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

    @Override
    public void setCreatedOn(Date CreatedOn) {
        super.setCreatedOn(CreatedOn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getCreatedOn() {
        return super.getCreatedOn(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRecordbyUsername(String username, String newPassword, String newEmail) {
        super.updateRecordbyUsername(username, newPassword, newEmail); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUserByUsername(String user) {
        return super.getUserByUsername(user); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isUniqueUsername(String user) {
        return super.isUniqueUsername(user); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkLines() {
        super.checkLines(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateUserDataLogic(String userName, String password) {
        super.validateUserDataLogic(userName, password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateUserData(String userName, String password) {
        super.validateUserData(userName, password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUserData(String name, String username, String email, String password) {
        super.addUserData(name, username, email, password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readFile() {
        super.readFile(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createFolder() {
        super.createFolder(); //To change body of generated methods, choose Tools | Templates.
    }

}
