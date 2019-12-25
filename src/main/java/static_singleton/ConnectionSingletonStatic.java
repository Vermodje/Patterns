package static_singleton;

import java.io.Serializable;

class ConnectionSingletonStatic implements Serializable {
    private static  ConnectionSingletonStatic INSTANCE;
    private String type;
    static {

            INSTANCE = new ConnectionSingletonStatic();
            System.out.println("Singleton was created");

    }
    public static ConnectionSingletonStatic getInstance(){
        return INSTANCE;
    }
    private ConnectionSingletonStatic(){
        
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
