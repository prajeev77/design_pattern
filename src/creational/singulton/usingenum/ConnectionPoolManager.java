package creational.singulton.usingenum;

public enum ConnectionPoolManager {
    INSTANCE;

    private ConnectionPoolManager() {
        System.out.println("Constructor is called");
    }

    public void getConnectionPoolManager() {
        System.out.println("Providing database connection");

    }
}
