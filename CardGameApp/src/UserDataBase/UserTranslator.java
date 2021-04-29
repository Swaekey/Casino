/*
 * The Four Lokos
 * Created by: Serena Herter, Srushti Honnenahalli, Alana Traylor, KeShawn Posey
 * Created on: 4/24/2021
 * This class translates the user information from the database
 */
package UserDataBase;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class UserTranslator {

    File txtfile = new File("Database");
    UUID userID;
    int ln = 1;
    Date date = new Date();
    String Name, Username, Email, Password;
    int GamesPlayed, GamesWon;
    Date CreatedOn;

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

    public void addUserData(String name, String username, String email, String password) {
        checkLines();
        userID = UUID.randomUUID();
        Name = name;
        Username = username;
        Email = email;
        Password = password;
        CreatedOn = date;
        GamesPlayed = 0;
        GamesWon = 0;
        if (!isValidEmail(email)) {
            System.out.println("bad email");
            return;
        }
        if (!isUniqueUsername(username)) {
            System.out.println("username taken");
            return;
        }
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; i < ln; i++) {
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

    public void validateUserData(String userName, String password) {
        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            randAccFile.readLine();
            randAccFile.readLine();
            //randAccFile.readLine();
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

    public void validateUserDataLogic(String userName, String password) {
        String un;
        String pw;

        try {
            RandomAccessFile randAccFile = new RandomAccessFile(txtfile + "\\users.txt", "rw");
            for (int i = 0; i < ln; i += 8) {
                randAccFile.readLine();
                randAccFile.readLine();
                un = randAccFile.readLine().substring(10);
                randAccFile.readLine();
                pw = randAccFile.readLine().substring(10);
                if (un.equals(Username) && pw.equals(Password)) {
                    System.out.println("login success");
                    break;
                } else {
                    System.out.println("login fail");
                }
                for (int j = 0; j < 4; j++) {
                    randAccFile.readLine();
                }
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

//    public void updateRecordbyUsername() {
//        String record;
//        String newPassword = Password;
//        String username = Username;
//
//        try {
//            File db = new File(txtfile + "\\users.txt");
//            File tempDB = new File(txtfile + "\\users_db_temp.txt");
//
//            BufferedReader br = new BufferedReader(new FileReader(db));
//            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
//
//            Scanner strInput = new Scanner(System.in);
//
//            System.out.println("Enter username: ");
//            username = strInput.nextLine();
//
//            System.out.println("Enter the new Password: ");
//            newPassword = strInput.nextLine();
//
//            while ((record = br.readLine()) != null) {
//                if (record.equals(username)) {
//                        return "UserTranslator{"
//                                + "userID=" + ID
//                                + ", Name=" + Name
//                                + ", Username=" + Username
//                                + ", Email=" + Email
//                                + ", Password=" + Password + '}';
//                } else {
//
//                   bw.write(record);
//                }
//                bw.flush();
//                bw.newLine();
//            }
//
//            bw.close();
//            br.close();
//            db.delete();
//            boolean success = tempDB.renameTo(db);
//            System.out.println(success);
//        } catch (IOException e) {
//
//        }
//
//    }

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
