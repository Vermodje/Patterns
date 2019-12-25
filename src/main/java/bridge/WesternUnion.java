package bridge;

class WesternUnion implements TransferTechnology {
    private long percent = 8;
    @Override
    public double getCommission() {
        return 0.92;
    }
}
