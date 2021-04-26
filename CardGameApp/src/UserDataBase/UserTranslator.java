/*
 * The Four Lokos
 * Created by: Serena Herter
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
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserTranslator {

    File txtfile = new File("Database");

    int ln;
    Date date = new Date();
    String Name, Username, Email, Password;

    public UserTranslator(String Name, String Username, String Email, String Password) {

        this.Name = Name;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }
    
    public UserTranslator(){
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public void addUserData(String name, String username, String email, String password) {
        UUID userID = UUID.randomUUID();
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; i < ln; i++) {
                randAccFile.readLine();
            }
            try {

                randAccFile.writeBytes("UserID: " + userID + "\r\n");
                randAccFile.writeBytes("Name: " + name + "\r\n");
                randAccFile.writeBytes("Username: " + username + "\r\n");
                randAccFile.writeBytes("Email: " + email + "\r\n");
                randAccFile.writeBytes("Password: " + password + "\r\n");
                randAccFile.writeBytes("CreatedAt: " + date + "\r\n");
                randAccFile.writeBytes("GamesPlayed: " + 0 + "\r\n");
                randAccFile.writeBytes("GamesWon: " + 0 + "\r\n");
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

    public void validateUserData(String userName, String password) {
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            randAccFile.readLine();
            randAccFile.readLine();
            randAccFile.readLine();
            Username = randAccFile.readLine().substring(10);
            System.out.println(Username);
            randAccFile.readLine();
            Password = randAccFile.readLine().substring(10);
            System.out.println(Password);
            randAccFile.readLine();
            randAccFile.readLine();
            randAccFile.readLine();
            if (userName.equals(Username) && password.equals(Password)) {
                System.out.println("login success");
            } else {
                System.out.println("login fail");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkLines() {
        try {
            ln = 1;
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; randAccFile.readLine() != null; i++) {
                ln++;
            }
            System.out.println("line: " + ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
