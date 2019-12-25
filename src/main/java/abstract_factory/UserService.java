package abstract_factory;

 class UserService implements Service {
    @Override
    public void add(Object o) {
        System.out.println("UserService");
    }
}
