package org.example;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AesEncryption {

    private static final String ALGORITHM = "AES";

    public static String encrypt(String key, String data) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(getValidKey(key), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String key, String encryptedData) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(getValidKey(key), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    private static byte[] getValidKey(String key) {
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        return Arrays.copyOf(keyBytes, 16); // Use the first 16 bytes (128 bits) for AES-128
    }

    public static void main(String[] args) throws Exception {
        String key = "mySecretKey12345"; // 16-byte key for AES-128
        String originalData = "PASSWORD";
        String encryptedData = encrypt(key, originalData);
        String decryptedData = decrypt(key, encryptedData);
        System.out.println("Original data: " + originalData);
        System.out.println("Encrypted data: " + encryptedData);
        System.out.println("Decrypted data: " + decryptedData);
    }
}
