package composite;

class Main {

    private static Account a = new AdminAccount();
    private static Account e = new EconomyAccount();
    private static Account p = new PremiumAccount();


    public static void main(String[] args) {
        CompositeAccount compositeAccount = new CompositeAccount();
        compositeAccount.addAccount(a);
        compositeAccount.addAccount(e);
        compositeAccount.addAccount(p);
        compositeAccount.getDetails();
    }
}
