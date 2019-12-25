package abstract_factory;

class UserFactory extends AbstractComponentsFactory {
    @Override
    Service getService(String name) {
        if (name.equalsIgnoreCase("user")) {
            return new UserService();
        } else return null;
    }

    @Override
    DAO getDAO(String name) {
        if (name.equalsIgnoreCase("user")) {
            return new UserDAO();
        } else return null;
    }
}
