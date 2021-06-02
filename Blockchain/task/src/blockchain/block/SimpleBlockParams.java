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
 