package blockchain;

import blockchain.block.Block;
import blockchain.data.SignedData;
import blockchain.hash.HashApprover;
import blockchain.hash.HashFunction;
import blockchain.hash.SHA256HashFunction;
import blockchain.mining.ComputeMiner;
import blockchain.mining.SimpleMinerParams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    private static final int NUMBER_OF_MINERS = 4;
    private static final int NUMBER_OF_BLOCKS = 15;
    private static final int NUMBER_OF_PRODUCERS = 5;
    private static List<String> TEXTS = List.of(
            "Hello",
            "Hi",
            "Byu",
            "Yes",
            "No"
    );

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final Blockchain<Block, SignedData> blockchain = new MyBlockchain();
        final ExecutorService minerExecutorService = Executors.newFixedThreadPool(NUMBER_OF_MINERS);
        final HashFunction hashFunction = new SHA256HashFunction();
        final SimpleMinerParams minerParams = new SimpleMinerParams();
        minerParams.setHashFunction(hashFunction);
        for (int count = 0; count < NUMBER_OF_BLOCKS; count++) {
            final HashApprover hashApprover = blockchain.getApprover();
            minerParams.setHashApprover(hashApprover);
            minerParams.setBlockParams(blockchain.getN