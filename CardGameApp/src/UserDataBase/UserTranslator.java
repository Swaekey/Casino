/*
 * The Four Lokos
 * Created by: Serena Herter, Srushti Honnenahalli, Alana Traylor, KeShawn Posey
 * Created on: 4/24/2021
 * This class translates the user information from the database
 */
package UserDataBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserTranslator {

    File txtfile = new File("Database");
    UUID userID;
    int ln = 1;
    Date date = new Date();
    String Name, Username, Email, Password;
    int GamesPlayed, GamesWon;
    Date CreatedOn = date;

    public UserTranslator(String Name, String Username, String Email, String Password) {
        userID = UUID.randomUUID();
        this.Name = Name;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }

    public UserTranslator() {

    }

    public void createFolder() {
        if (!txtfile.exists()) {
            txtfile.mkdirs();
        }
    }

    public void readFile() {

        try {
            FileReader reader = new FileReader(txtfile + "\\users.txt");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter writefile = new FileWriter(txtfile + "\\users.txt");
            } catch (IOException ex1) {
                Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    public void addUserData(String _name, String _username, String _email, String _password) {
        checkLines();
        userID = UUID.randomUUID();
        Name = _name;
        Username = _username;
        Email = _email;
        Password = _password;
        CreatedOn = date;
        GamesPlayed = 0;
        GamesWon = 0;
        if (!isValidEmail(_email)) {
            System.out.println("bad email");
            return;
        }
        if (!isUniqueUsername(_username)) {
            System.out.println("username taken");
            return;
        }
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 1; i < ln; i++) {
                randAccFile.readLine();
            }
            try {

                randAccFile.writeBytes("UserID: " + userID + "\r\n");
                randAccFile.writeBytes("Name: " + Name + "\r\n");
                randAccFile.writeBytes("Username: " + Username + "\r\n");
                randAccFile.writeBytes("Email: " + Email + "\r\n");
                randAccFile.writeBytes("Password: " + Password + "\r\n");
                randAccFile.writeBytes("CreatedOn: " + CreatedOn + "\r\n");
                randAccFile.writeBytes("GamesPlayed: " + GamesPlayed + "\r\n");
                randAccFile.writeBytes("GamesWon: " + GamesWon + "\r\n");
                randAccFile.writeBytes("\r\n");

            } catch (IOException ex) {
                Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validateUserData(String _username, String _password) {
        String un;
        String pw;

        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; i < ln - 8; i += 8) {
                randAccFile.readLine();
                randAccFile.readLine();
                un = randAccFile.readLine().substring(10);
                randAccFile.readLine();
                pw = randAccFile.readLine().substring(10);
                if (un.equals(_username) && pw.equals(_password)) {
                    System.out.println("login success");
                    return true;
                } else {
                    //System.out.println("login fail");
                }
                for (int j = 0; j < 4; j++) {
                    randAccFile.readLine();
                }
            }
            System.out.println("login fail");
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void checkLines() {
        try {
            ln = 1;
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; randAccFile.readLine() != null; i++) {
                ln++;
            }
            //System.out.println("line: " + ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static boolean isValidEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public boolean isUniqueUsername(String user) {
        String un;
        // System.out.println(ln);
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; i < ln - 8; i += 8) {
                //System.out.println(i);
                randAccFile.readLine();
                randAccFile.readLine();
                un = randAccFile.readLine().substring(10);
                //System.out.println(un);
                if (un.equals(user)) {
                    return false;
                }
                for (int j = 0; j < 6; j++) {
                    randAccFile.readLine();
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("new username");
        return true;
    }

    public String getUserByUsername(String user) {
        if (isUniqueUsername(user)) {
            return "no such user";
        } else {

            String un = "";
            String ID = "";
            String Played = "";
            String Won = "";
            String Created = "";
            try {
                RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
                for (int i = 0; i < ln - 8; i += 8) {
                    ID = randAccFile.readLine().substring(8);
                    Name = randAccFile.readLine().substring(6);
                    un = randAccFile.readLine().substring(10);
                    Email = randAccFile.readLine().substring(7);
                    Password = randAccFile.readLine().substring(10);
                    Played = randAccFile.readLine().substring(13);
                    Won = randAccFile.readLine().substring(10);
                    Created = randAccFile.readLine().substring(11);
                    randAccFile.readLine();

                    if (un.equals(user)) {
                        return "UserTranslator{"
                                + "userID=" + ID
                                + ", Name=" + Name
                                + ", Username=" + un
                                + ", Email=" + Email
                                + ", Password=" + Password
                                + ", GamesPlayed=" + Played
                                + ", GamesWon=" + Won
                                + ", CreatedOn=" + Created + '}';
                    } else {
                        //System.out.println("still checking");
                    }

                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        }

    }

    public String CreatedOn() {
        DateFormat dateForm = new SimpleDateFormat("MM-dd-yyyy");
        String strDate = dateForm.format(CreatedOn);

        return strDate;
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

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date CreatedOn) {
        this.CreatedOn = CreatedOn;
    }
    


}
