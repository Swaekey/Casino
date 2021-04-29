/*
 * The Four Lokos
 * Created by: Alana Traylor, Serena Herter
 * Created on: 4/26/21
 * This class connects the UserTranslator class to the view
 */
package ViewControllers;

import UserDataBase.UserTranslator;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserDataController extends UserTranslator {

    File txtfile;
    public static String Name, Email, Password;
    public static String Username = "player";
    public int GamesPlayed;
    public int GamesWon;

    public UserDataController(String Name, String Username, String Email, String Password) {
        super(Name, Username, Email, Password);
        createFolder();
        readFile();
        checkLines();

    }

    public UserDataController() {
        createFolder();
        readFile();
        checkLines();

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
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

    public String GamesPlayed() {
        return Integer.toString(GamesPlayed);
    }

    public String GamesWon() {
        return Integer.toString(GamesWon);
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
    public String CreatedOn() {
        return super.CreatedOn(); //To change body of generated methods, choose Tools | Templates.
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
    public boolean validateUserData(String userName, String password) {
        return super.validateUserData(userName, password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUserData(String _name, String _username, String _email, String _password) {
        super.addUserData(_name, _username, _email, _password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readFile() {
        super.readFile(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createFolder() {
        super.createFolder(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGamesWon(int GamesWon) {
        super.setGamesWon(GamesWon); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGamesWon() {
        return super.getGamesWon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGamesPlayed(int GamesPlayed) {
        super.setGamesPlayed(GamesPlayed); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGamesPlayed() {
        return super.getGamesPlayed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incrementGamesWon() {
        super.incrementGamesWon(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incrementGamesPlayed() {
        super.incrementGamesPlayed(); //To change body of generated methods, choose Tools | Templates.
    }

}
