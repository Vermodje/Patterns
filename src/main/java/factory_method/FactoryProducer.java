package factory_method;

class FactoryProducer {
    public static CreateConnection createConnection(String name) {
        if (name.equalsIgnoreCase("sql")) {
            return new SQLFactory();
        } else if (name.equalsIgnoreCase("h2")) {
            return new H2Factory();
        } else return null;
    }
}
