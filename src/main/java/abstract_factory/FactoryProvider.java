package abstract_factory;

class FactoryProvider {
    public static AbstractComponentsFactory getFactory(int i) {
        if (i == 1) {
            return new UserFactory();
        } else {
            return new RoleFactory();
        }
    }
}
