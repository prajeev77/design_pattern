package creational.singulton.eager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static creational.singulton.eager.ConnectionPoolManager.getConnectionPoolManager;

public class SingultonDesignPattern {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ConnectionPoolManager connectionPoolManager1 = getConnectionPoolManager();
        System.out.println(connectionPoolManager1);

        Constructor<ConnectionPoolManager> constructor =ConnectionPoolManager.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ConnectionPoolManager connectionPoolManager2= constructor.newInstance();
        System.out.println(connectionPoolManager2);
    }
}
