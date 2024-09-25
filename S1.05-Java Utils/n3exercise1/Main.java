package n3exercise1;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            SecretKey secretKey = AES.generateAESKey();
            IvParameterSpec ivSpec = AES.generateIV();

            File inputFile = new File(Paths.get(System.getProperty("user.dir"), "S1.05-Java Utils", "n1exercise4", "sample.txt").toString());
            File encryptedFile = new File(Paths.get(System.getProperty("user.dir"), "S1.05-Java Utils", "n3exercise1", "encrypted.txt").toString());
            File decryptedFile = new File(Paths.get(System.getProperty("user.dir"), "S1.05-Java Utils", "n3exercise1", "decrypted.txt").toString());

            AES.encryptFile(secretKey, ivSpec, inputFile, encryptedFile);
            System.out.println("File encrypted successfully.");

            AES.decryptFile(secretKey, encryptedFile, decryptedFile);
            System.out.println("File decrypted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
