package adapter;

class Main {
    public static void main(String[] args) {
        long dollars = 14000;
        BlockChain btc = new MoneyAdapter(new YandexMoney(14000));
        long totalBtc = btc.recalculation();
        System.out.println(totalBtc);
    }
}
