package creational.singulton.threadsafe;

import com.sun.source.tree.SynchronizedTree;

public class ConnectionPoolManager {
    private static ConnectionPoolManager connectionPoolManager=null;

    private ConnectionPoolManager(){
        System.out.println("Constructor is called");
    }

   /* public static synchronized ConnectionPoolManager getConnectionPoolManager() {
        if (connectionPoolManager == null) {
            connectionPoolManager = new ConnectionPoolManager();
        }
        return connectionPoolManager;
    }*/

    /*public static ConnectionPoolManager getConnectionPoolManager() {
        synchronized (ConnectionPoolManager.class) {
            if (connectionPoolManager == null) {
                connectionPoolManager = new ConnectionPoolManager();
            }
            return connectionPoolManager;
        }
    }*/

    //Double-Checked Locking
    public static ConnectionPoolManager getConnectionPoolManager() {
        if (connectionPoolManager == null) {
            synchronized (ConnectionPoolManager.class) {
                if (connectionPoolManager == null) {
                    connectionPoolManager = new ConnectionPoolManager();
                }
                return connectionPoolManager;
            }
        }
        return connectionPoolManager;
    }


}
