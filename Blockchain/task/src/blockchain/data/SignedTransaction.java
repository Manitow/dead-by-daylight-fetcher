package blockchain.data;

import blockchain.reward.Reward;

import java.security.PublicKey;

public class SignedTransaction implements Transaction, SignedData {
    private final long id;
    private final String from;
    private final String to;
    private final Reward reward;
    private final String sign;
    private final PublicKey key;

    public SignedTransaction(long id, String from, String to, Reward reward, String sign, PublicKey key) {
        this.i