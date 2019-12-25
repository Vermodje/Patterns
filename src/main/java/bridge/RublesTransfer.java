package bridge;

class RublesTransfer extends Transfer {
    private long amount;

    protected RublesTransfer(TransferTechnology technology) {
        super(technology);
    }

    @Override
    public double transferMoney(long amount) {
        return (amount - technology.getCommission() * amount) + amount;
    }
}
