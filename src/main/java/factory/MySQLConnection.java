package factory;

class MySQLConnection implements Connection {
    public void setConnection() {
        System.out.println("MySql Connection starting");
    }
}
