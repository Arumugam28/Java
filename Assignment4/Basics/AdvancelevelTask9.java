import java.io.*;

public class AdvancelevelTask9 {
    public static void encryptDecrypt(String inputFile, String outputFile, int key) {
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            
            int data;
            while((data = fis.read()) != -1) {
                int encryptedData = data ^ key;
                fos.write(encryptedData);
            }
            fis.close();
            fos.close();
            System.out.println("Operation completed successfully!");
            
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";
        int key = 123; 
        
        System.out.println("Encrypting file...");
        encryptDecrypt(inputFile, encryptedFile, key);
        
        System.out.println("Decrypting file...");
        encryptDecrypt(encryptedFile, decryptedFile, key);
        
        System.out.println("Encryption and Decryption done.");
    }
}
