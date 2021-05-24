package blockchain;

import blockchain.block.Block;
import blockchain.block.ImmutablePartBlockParams;
import blockchain.block.NZerosBlock;
import blockchain.block.PartBlockParams;
import blockchain.data.Data;
import blockchain.data.DataParams;
import blockchain.data.ImmutableDataParams;
import blockchain.data.SignedData;
import blockchain.hash.HashApprover;
import blockchain.hash.NZerosHashApprover;
import blockchain.reward.Reward;
import blockchain.reward.VirtualCoin;
import blockchain.util.NZeros;

import java.util.*;

public class MyBlockchain implements Blockchain<Block, SignedData> {
    protected final Deque<Block> blocks;
    protected final Deque<SignedData> dataSet;
    protected final Object lock = new Object();
    protected long blockId;
    protected long dataId;
    protected long reward;
    protected NZeros nZeros;
    protected NZerosHashApprover approver;
    protected PartBlockParams blockParams;

    public MyBlockchain() {
        blocks = new ArrayDeque<>();
        dataSet = new ArrayDeque<>();
        blockId = 1;
        dataId = 1;
        reward = 100;
        nZeros = new NZeros(0);
        prepareNext();
    }

    protected void prepareNext() {
        dataSet.