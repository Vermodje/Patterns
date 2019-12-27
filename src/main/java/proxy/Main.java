package proxy;

class Main {
    public static void main(String[] args) {
        User user = new User("admin", new Role("Role_admin"));
        Connection connection = new ProxyConnection(user, user.getRole());
        connection.connect("MySQL Workbench");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        connection.close();
    }
}
