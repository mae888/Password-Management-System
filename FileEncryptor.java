package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FileEncryptor {

    private static final byte[] initializationVector = new byte[]{
        0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
        0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f
    };
    private static final String key = "UkXp2s5v8y/B?E(H";
    private static final String algorithm = "AES";
    private static final int keySize = 128;

    public static void readFile(String path) throws FileNotFoundException {
        String content = "";
        Scanner scan = new Scanner(new FileReader(path));
        while (scan.hasNext()) {
            content += scan.next();
        }
        System.out.println(content);
    }

    public void encryptFile(String inputFile, String outputFile)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IOException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(algorithm + "/CBC/PKCS5Padding");
        AlgorithmParameterSpec algorithmParameterSpec = new IvParameterSpec(initializationVector);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, algorithmParameterSpec);

        try (FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(outputFile);
                CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    public void decryptFile(String inputFile, String outputFile)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IOException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(algorithm + "/CBC/PKCS5Padding");
        AlgorithmParameterSpec algorithmParameterSpec = new IvParameterSpec(initializationVector);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, algorithmParameterSpec);

        try (FileInputStream inputStream = new FileInputStream(inputFile);
                CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
                FileOutputStream outputStream = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }

}

class TFEC{
    public static void main(String[] args){
        FileEncryptor fe = new FileEncryptor();
        File f = new File("passwords");
        try {
            fe.encryptFile("Passwords", "C:\\Users\\acer\\Desktop\\Encrypted Passwords");
            fe.decryptFile("C:\\Users\\acer\\Desktop\\Encrypted Passwords", "C:\\Users\\acer\\Desktop\\Decrypted Passwords");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TFEC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(TFEC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(TFEC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(TFEC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TFEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}