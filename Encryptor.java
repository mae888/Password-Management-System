package Main;

import java.security.Key;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor {

    final private String EncryptionKey = "$B&E)H@McQeThWmZq4t7w!z%C*F-JaNd";

    public Encryptor() {
    }

    public String encrypt(String plainText) throws Exception {
        Key aesKey = new SecretKeySpec(EncryptionKey.getBytes(), "AES");
        long encryptionStartTime = System.nanoTime();
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        long encryptionEndTime = System.nanoTime();
        System.out.println("Encryption Time: " + (encryptionEndTime - encryptionStartTime) + " ns");
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public String decrypt(String encryptedText) throws Exception {
        Key aesKey = new SecretKeySpec(EncryptionKey.getBytes(), "AES");
        long decryptionStartTime = System.nanoTime();
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, aesKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        long decryptionEndTime = System.nanoTime();
        System.out.println("Decryption Time: " + (decryptionEndTime - decryptionStartTime) + " ns");
        return new String(decrypted);
    }

    public String getEncryptionKey() {
        return EncryptionKey;
    }

}

class tester {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Encryptor e = new Encryptor();
        String pass = "password";
        String enc = e.encrypt(pass);
        String dec = e.decrypt("wpdDUgi3mfTK2y62FPJEhQ==");
        
    }
}


/*

 */
//    public String encrypt(String plainText) {
//        String hash = BCrypt.hashpw(plainText, BCrypt.gensalt(12));
//        return hash;
//    }
//    
//    public boolean checkPassword(String p1, String hash){
//        return BCrypt.checkpw(p1, hash);
//    }
