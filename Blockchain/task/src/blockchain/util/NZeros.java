package blockchain.util;

import java.util.Random;

public class NZeros {
    Random random;
    private int count;
    private int increasedCount;
    private int decreasedCount;

    public NZeros(int count) {
        this.count = count;
        random = new Random();
        increasedCount = 0;
        decreasedCount = 0;
    }

    public int getCount() {
        return count;
    }

    public Stri