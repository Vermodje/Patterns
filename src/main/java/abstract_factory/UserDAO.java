package abstract_factory;

class UserDAO implements DAO {
    @Override
    public void save(Object o) {
        System.out.println("User DAO");
    }
}
