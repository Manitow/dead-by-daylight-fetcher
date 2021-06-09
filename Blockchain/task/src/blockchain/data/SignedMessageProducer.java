package blockchain.data;

import blockchain.util.KeysGenerator;
import blockchain.util.RSACryptographer;
import blockchain.util.RSAGenerator;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SignedMessageProducer extends MessageProducer<SignedMessage> {
    protected final Supplier<DataParams> params;
    protected final KeysGenerator keysGenerator;
    protected final PublicKey publicKey;
    protected final PrivateKey privateKey;

    public SignedMessageProducer(String name, List<String> texts,
                                 Consumer<SignedMessage> consumer, Supplier<DataParams> params