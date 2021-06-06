package blockchain.data;

import java.security.PublicKey;
import java.util.Objects;

public class SignedMessage extends Message implements SignedData {
    protected final PublicKey key;
    protected final String sign;

    public SignedMessage(long id, String text, PublicKey key, String sign) {
        super(id, text);
        this.key = key;
        this.sign = sign;
