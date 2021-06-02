package blockchain.block;

import java.util.Objects;

public class SimpleBlockParams implements BlockParams {
    protected long id;
    protected long timestamp;
    protected long runtime;
    protected long magicNumber;
    protected String hash;
    protected String previousHash;
    protected String owner;

    public SimpleBlockParams(PartBlockParams params) {
        this.id = params.getId();
        this.previousHash = params.getPreviousHash();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    @Override
    public long getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(long magicNumber) {
        this.magicNumber = magicNumber;
    }

    @Override
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
 