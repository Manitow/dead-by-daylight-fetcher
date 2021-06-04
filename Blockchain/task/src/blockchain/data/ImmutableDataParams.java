package blockchain.data;

import java.util.Objects;

public class ImmutableDataParams implements DataParams {
    protected final long id;

    public ImmutableDataParams(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public boole