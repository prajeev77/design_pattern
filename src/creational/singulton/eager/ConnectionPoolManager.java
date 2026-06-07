package creational.singulton.eager;

public class ConnectionPoolManager {
    private static final ConnectionPoolManager connectionPoolManager = new ConnectionPoolManager();

    private ConnectionPoolManager(){
        System.out.println("Constructor is called");
    }

    public static ConnectionPoolManager getConnectionPoolManager(){
        return connectionPoolManager;
    }
}
