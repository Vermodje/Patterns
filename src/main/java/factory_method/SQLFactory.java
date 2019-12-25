package factory_method;

class SQLFactory implements CreateConnection {
    @Override
    public Connection create() {
        return new MySQLConnection();
    }
}
