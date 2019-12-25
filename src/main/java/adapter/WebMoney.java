package adapter;

class WebMoney implements WebWallet {
    private long amount;
    public WebMoney(long amount){
        this.amount = amount;
    }
    @Override
    public long getAmount() {
        return amount;
    }
}
