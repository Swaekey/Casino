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

    @Override
    public void setCreatedOn(Date CreatedOn) {
        super.setCreatedOn(CreatedOn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getCreatedOn() {
        return super.getCreatedOn(); //To change body of generated methods, choose Tools | Templates.
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
    public void setPassword(String Password) {
        super.setPassword(Password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsername(String Username) {
        super.setUsername(Username); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return super.getUsername(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String Name) {
        super.setName(Name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
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
    public boolean validateUserData(String _username, String _password) {
        return super.validateUserData(_username, _password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUserData(String _name, String _username, String _email, String _password) {
        super.addUserData(_name, _username, _email, _password); //To change body of generated methods, choose Tools | Templates.
    }

}
