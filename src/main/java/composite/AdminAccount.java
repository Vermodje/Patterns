package composite;

class AdminAccount implements Account {
    private String details;

    public AdminAccount() {
        this.details = "It is admin account";
    }

    @Override
    public void getDetails() {
        System.out.println(details);
    }
}
