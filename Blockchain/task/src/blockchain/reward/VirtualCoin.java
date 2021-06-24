package blockchain.reward;

import java.util.Objects;

public class VirtualCoin implements Reward {
    public static final VirtualCoin ZERO = new VirtualCoin(0);

    private final long amount;
    private final String currency;

    public VirtualCoin(long amount) {
        this.amount = amount;
        this.currency = "VC";
    }

    @Override
    public long getAmount() {
