package blockchain.mining;

import blockchain.block.PartBlockParams;
import blockchain.hash.HashApprover;
import blockchain.hash.HashFunction;

public class SimpleMinerParams implements MinerParams {
    private String name;
    private HashFunction hashFunction;
    private HashApprover hashApprover;
    private PartBlockParams blockParams;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public HashFunction getHashFunction() {
        return hashFunction;
    }

    public void setHashFunction(HashFunction hashFunc