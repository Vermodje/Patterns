package builder;

class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Петя", "Иванов").setCountry("Russia").build();
    }
}
