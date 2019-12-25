package adapter;

class MoneyAdapter implements BlockChain {
    private WebWallet webWallet;

    public MoneyAdapter(WebWallet webWallet) {
        this.webWallet = webWallet;
    }

    @Override
    public long recalculation() {
        return webWallet.getAmount() / 7000;
    }
}
