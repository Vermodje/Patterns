package composite;

class EconomyAccount implements Account {
    private String details;

    public EconomyAccount() {
        this.details = "It is economy account";
    }

    @Override
    public void getDetails() {
        System.out.println(details);
    }
}
