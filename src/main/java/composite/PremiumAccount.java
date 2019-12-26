package composite;

public class PremiumAccount implements Account {
    private String details;

    public PremiumAccount() {
        this.details = "It is premium account";
    }

    @Override
    public void getDetails() {
        System.out.println(details);
    }
}
