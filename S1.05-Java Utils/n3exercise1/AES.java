package n3exercise1;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;

public class AES {
    private static final int AES_KEY_SIZE = 128;
    private static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";

    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(AES_KEY_SIZE);
        return keyGenerator.generateKey();
    }

    public static IvParameterSpec generateIV() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    public static void encryptFile(SecretKey key, IvParameterSpec initVector, File inputFile, File outputFile) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key, initVector);

        try (FileInputStream fileInStream = new FileInputStream(inputFile);
             FileOutputStream fileOutStream = new FileOutputStream(outputFile)) {

            byte[] inputBytes = new byte[(int) inputFile.length()];
            fileInStream.read(inputBytes);

            byte[] encryptedBytes = cipher.doFinal(inputBytes);

            fileOutStream.write(initVector.getIV());
            fileOutStream.write(encryptedBytes);
        }
    }

    public static void decryptFile(SecretKey key, File inputFile, File outputFile) throws Exception {
        try (FileInputStream fileInStream = new FileInputStream(inputFile);
             FileOutputStream fileOutStream = new FileOutputStream(outputFile)) {

            byte[] initVector = new byte[16];
            fileInStream.read(initVector);

            IvParameterSpec ivSpec = new IvParameterSpec(initVector);

            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);

            byte[] encryptedBytes = new byte[(int) inputFile.length() - 16];
            fileInStream.read(encryptedBytes);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            fileOutStream.write(decryptedBytes);
        }
    }
}
