package bridge;

class PayPal implements TransferTechnology {
    private long percent = 5;
    @Override
    public double getCommission() {
        return 0.95;
    }
}
