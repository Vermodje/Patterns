package bridge;

class DollarsTransfer extends Transfer {
    private long amount;

    public DollarsTransfer(TransferTechnology technology) {
        super(technology);
    }

    @Override
    public double transferMoney(long amount) {
        return amount * 62 - (technology.getCommission() * amount / 62);
    }
}
