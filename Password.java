package Main;

import java.util.Random;

public class Password {

    private String website;
    private String pass;
    private String username;

    public Password() {
    }

    public Password(String website, String username, String pass) {
        this.website = website;
        this.username = username;
        this.pass = pass;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String generatePassword() {
        String lc = "qwertyuiopasdfghjklzxcvbnm";
        String uc = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String num = "0123456789";
        String sc = "!@#$%&*?";
        String password = "";
        Random r = new Random();
        String charSpace = lc + uc + num + sc;
        for (int i = 0; i < 16; i++) {
            if (i == 0) {
                password += uc.charAt(r.nextInt(uc.length()));
            } else if (i == 5) {
                password += lc.charAt(r.nextInt(lc.length()));
            } else if (i == 9) {
                password += sc.charAt(r.nextInt(sc.length()));
            } else {
                password += charSpace.charAt(r.nextInt(charSpace.length()));
            }
        }
        return password;
    }

}
