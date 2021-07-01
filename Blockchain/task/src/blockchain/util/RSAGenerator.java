package blockchain.util;

import java.security.*;

public class RSAGenerator implements KeysGenerator {
    private final KeyPairGenerator generator;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public RSAGenerator(int length) {
        try {
            generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(length);
        } catch (NoSuchAlgorithmException e) {
     