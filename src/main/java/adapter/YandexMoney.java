package adapter;

class YandexMoney implements WebWallet {
    private long amount;

    public YandexMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public long getAmount() {
        return amount;
    }
}
