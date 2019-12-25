package factory;

class H2Connection implements Connection {
    public void setConnection() {
        System.out.println("H2 connection starting");
    }
}
