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

public class Main 