package builder;

public class Director {
    Account.AccountBuilder accountBuilder;

    public Director(Account.AccountBuilder accountBuilder) {
        this.accountBuilder = accountBuilder;
    }

    public Account.AccountBuilder getAccountBuilder() {
        return accountBuilder;
    }
}
