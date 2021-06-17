package blockchain.hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256HashFunction implements HashFunction {
    @Override
    public String hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes(StandardCharset