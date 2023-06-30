package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PasswordRecord {

    public PasswordRecord() {
    }

    public boolean addPassword(Password password) throws Exception {
        if (!PasswordDetailsExist(password)) {
            Encryptor e = new Encryptor();
            String pass = password.getPass();
            String website = password.getWebsite();
            String username = password.getUsername();
            try {
                FileWriter r = new FileWriter("Passwords", true);
                r.write(website + "-" + username + "-" + e.encrypt(pass) + "\n");
                r.flush();
                r.close();
                return true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is a password associated with \"" + password.getWebsite() + "\" with the username \""
                    + password.getUsername() + "\" already. You can use the same website with different usernames");
            return false;
        }
        return false;
    }

    public boolean PasswordDetailsExist(Password password) {
        String pass = "";
        String website = "";
        String un = "";
        Encryptor en = new Encryptor();
        try {
            Scanner scan = new Scanner(new FileReader("Passwords"));
            scan.useDelimiter("[-\n]");
            while (scan.hasNext()) {
                website = scan.next();
                un = scan.next();
                pass = scan.next();
                if (website.equalsIgnoreCase(password.getWebsite()) && un.equals(password.getUsername()) && pass.equals(en.encrypt(password.getPass()))) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return false;
    }

    public boolean VerifyPassword(Password password) {
        String pass = "";
        String website = "";
        String un = "";
        Encryptor en = new Encryptor();
        try {
            Scanner scan = new Scanner(new FileReader("Passwords"));
            scan.useDelimiter("[-\n]");
            while (scan.hasNext()) {
                website = scan.next();
                un = scan.next();
                pass = scan.next();
                if (website.equalsIgnoreCase(password.getWebsite()) && un.equals(password.getUsername()) && pass.equals(password.getPass())) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return false;
    }

}

class Test {

    public static void main(String[] args) throws Exception {
        PasswordRecord p = new PasswordRecord();
        Password password = new Password("Netflix", "Mo123_mm", "password123");
        p.addPassword(password);
        System.out.println(p.PasswordDetailsExist(new Password("Netflix", "Mo123_mm", "password123")));
    }
}

//    public void resetPassword(Password oldPass, String newPassword) {
//        Encryptor encryptor = new Encryptor();
//        File oldF = new File("Passwords");
//        File temp = new File("Temp.txt");
//        String website = "", password = "", un = "";
//        try {
//            Scanner scan = new Scanner(new FileReader("Passwords"));
//            FileWriter r = new FileWriter(temp);
//            scan.useDelimiter("[-\n]");
//            while (scan.hasNext()) {
//                website = scan.next();
//                un = scan.next();
//                password = scan.next();
//                if (!website.equalsIgnoreCase(oldPass.getWebsite()) && !un.equals(oldPass.getUsername()) && !password.equals(oldPass.getPass())) {
//                    r.write(website + "-" + un + "-" + password + "\n");
//                }
//            }
//            r.write(oldPass.getWebsite() + "-" + oldPass.getUsername() + "-" + encryptor.encrypt(newPassword) + "\n");
//            scan.close();
//            r.flush();
//            r.close();
//            oldF.delete();
//            File f = new File("Passwords");
//            temp.renameTo(f);
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, e);
//            e.printStackTrace();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            e.printStackTrace();
//        }
//    }
