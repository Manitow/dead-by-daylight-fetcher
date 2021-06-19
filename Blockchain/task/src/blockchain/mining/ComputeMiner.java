package blockchain.mining;

import blockchain.block.Block;
import blockchain.block.ImmutableBlock;
import blockchain.block.PartBlockParams;
import blockchain.block.SimpleBlockParams;
import blockchain.hash.HashApprover;
import blockchain.hash.HashFunction;

import java.util.Random;
import java.util.concurrent.Callable;

import static blockchain.util.CommonUtils.getTimestamp;

public class ComputeMiner implements Miner, Callable<Block> {
    private final String name;
    private final HashFunction hashFunction;
    private final HashApprover hashAppro