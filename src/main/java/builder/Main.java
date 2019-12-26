package builder;

class Main {
    public static void main(String[] args) {
        Account account = new Director(new Account.PrimaryAccountBuilder()).getAccountBuilder()
                .setName("Петя")
                .setSurname("Иванов")
                .setCountry("Russia")
                .build();
    }
}
