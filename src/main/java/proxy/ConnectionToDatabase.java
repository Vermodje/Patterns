package proxy;

class ConnectionToDatabase implements Connection {
    private String dataBaseName;

    @Override
    public void close() {
        System.out.println("Connection closed");
    }

    public ConnectionToDatabase(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    @Override
    public void connect(String dataBaseName) {
        System.out.println("You are inside in " + dataBaseName);
    }

}
