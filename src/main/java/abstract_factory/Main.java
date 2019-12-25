package abstract_factory;

class Main {
    public static void main(String[] args) {
        FactoryProvider.getFactory(1).getService("user").add(new Object());
        FactoryProvider.getFactory(1).getDAO("user").save(new Object());
    }
}
