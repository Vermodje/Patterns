package proxy;


class ProxyConnection implements Connection {
    private Connection connection;
    private User guest;
    private Role access;
    private boolean openned;

    public ProxyConnection(User guest, Role access) {
        this.guest = guest;
        this.access = access;
    }

    @Override
    public void connect(String dataBaseName) {
        if(access.getRoleName().equalsIgnoreCase("ROLE_ADMIN") && !openned){
            System.out.println("Open connection to " + dataBaseName + "...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            connection = new ConnectionToDatabase(dataBaseName);
            connection.connect(dataBaseName);
            openned = true;
        }
        else if (openned = true){
            System.out.println("Connection already opening");
        }
        else {
            System.out.println("Access denied");
        }

    }

    @Override
    public void close() {
        System.out.println("Connection closing...." + " " + "Please wait");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        connection.close();
        openned = false;
    }

}
