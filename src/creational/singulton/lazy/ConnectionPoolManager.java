package creational.singulton.lazy;

public class ConnectionPoolManager {
    private static ConnectionPoolManager connectionPoolManager=null;

    private ConnectionPoolManager(){
        System.out.println("Constructor is called");
    }

    public static ConnectionPoolManager getConnectionPoolManager() {
        if (connectionPoolManager == null) {
            connectionPoolManager = new ConnectionPoolManager();
        }
        return connectionPoolManager;
    }
}
