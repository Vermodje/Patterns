package abstract_factory;

class RoleFactory extends AbstractComponentsFactory {
    @Override
    Service getService(String name) {
        if (name.equalsIgnoreCase("role")) {
            return new RoleService();
        } else return null;
    }

    @Override
    DAO getDAO(String name) {
        if (name.equalsIgnoreCase("role")) {
            return new RoleDAO();
        } else return null;
    }
}
