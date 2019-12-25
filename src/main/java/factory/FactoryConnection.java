package factory;

class FactoryConnection {
    static Connection getConnection(String connectionName){
        if(connectionName.equalsIgnoreCase("mysql")){
            return new MySQLConnection();
        }
        else if(connectionName.equalsIgnoreCase("h2")){
            return new H2Connection();
        }
        else {
            return null;
        }
    }
}
