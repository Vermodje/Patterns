package factory_method;

class H2Factory implements CreateConnection {
    @Override
    public Connection create() {
        return new H2Connection();
    }
}
