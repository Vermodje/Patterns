package prototype;

public class Main {
    public static void main(String[] args) {
        Account account = new PrimaryAccount();
        AccountReester.add(account);
        Account copy = AccountReester.getCopy("primary");
        account.setStatus("banned");
        System.out.println(account.getStatus());
        System.out.println(copy.getStatus());
    }
}
