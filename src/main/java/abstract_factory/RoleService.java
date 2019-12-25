package abstract_factory;

class RoleService implements Service {
    @Override
    public void add(Object o) {
        System.out.println("Role Service");
    }
}
