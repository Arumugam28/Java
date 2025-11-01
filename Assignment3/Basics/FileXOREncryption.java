import java.io.*;

public class FileXOREncryption {
    
    private static final byte KEY = 0x5A;

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";

        try {
            encryptFile(inputFile, encryptedFile);
            System.out.println("File encrypted successfully!");
            decryptFile(encryptedFile, decryptedFile);
            System.out.println("File decrypted successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void encryptFile(String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ KEY);
            }
        }
    }
    public static void decryptFile(String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ KEY);
            }
        }
    }
}
