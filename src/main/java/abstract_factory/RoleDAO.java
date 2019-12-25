package abstract_factory;

class RoleDAO implements DAO {
    @Override
    public void save(Object o) {
        System.out.println("Role DAO");
    }
}
