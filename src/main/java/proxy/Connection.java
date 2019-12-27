package proxy;

interface Connection {
    void connect(String dataBaseName);
    void close();
}
