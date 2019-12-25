package synchronized_singleton;

import java.sql.Connection;

class ConnectionSingleton {
    private static volatile ConnectionSingleton instance;
    private ConnectionSingleton() {
    }

    /*public static synchronized ConnectionSingleton getInstance(int threadCount) {
        System.out.println("thread#" + threadCount + " starting working");
        if (instance == null) {
            instance = new ConnectionSingleton();
            System.out.println("Singleton was created by thread" + threadCount);
        }
        return instance;
    }*/
     public static ConnectionSingleton getInstance(int threadCount) {
         if(instance == null){
             System.out.println("thread#" + threadCount + " starting working");
             synchronized (ConnectionSingleton.class){
                 System.out.println("thread" + threadCount + " get block");
                 if (instance == null) {
                     instance = new ConnectionSingleton();
                     System.out.println("Singleton was created by thread" + threadCount);
                 }
             }
         }
        return instance;
    }


}
