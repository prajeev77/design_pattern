package creational.singulton.threadsafe;

import java.util.concurrent.Executors;

public class SingultonDesignPattern {
    public static void main(String[] args) {


      /*  ConnectionPoolManager connectionPoolManager1 =  ConnectionPoolManager.getConnectionPoolManager();
        ConnectionPoolManager connectionPoolManager2 =  ConnectionPoolManager.getConnectionPoolManager();
        System.out.println(connectionPoolManager1);
        System.out.println(connectionPoolManager2);*/

        //break this singulton pattern
        for (int i = 0; i < 10; i++) {
            Executors.newSingleThreadExecutor().execute(() -> {
                ConnectionPoolManager connectionPoolManager = ConnectionPoolManager.getConnectionPoolManager();
                System.out.println(connectionPoolManager);

            });
        }
    }
}
