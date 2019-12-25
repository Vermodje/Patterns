package adapter;

public class Cryptonator implements BlockChain {
    private long amount;

    public Cryptonator(long amount) {
        this.amount = amount;
    }

    @Override
    public long recalculation() {
        return amount;
    }
}
