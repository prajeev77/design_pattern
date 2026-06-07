package creational.singulton.usingenum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;

public class SingultonDesignPattern {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        ConnectionPoolManager connectionPoolManager = ConnectionPoolManager.INSTANCE;
        System.out.println(connectionPoolManager.hashCode());

        Constructor<ConnectionPoolManager> constructors = ConnectionPoolManager.class.getDeclaredConstructor();
        ConnectionPoolManager connectionPoolManager1 = null;
        constructors.setAccessible(true);
        connectionPoolManager1 = constructors.newInstance();
        System.out.println(connectionPoolManager1);

        // enum can be beak becasue jvm check in case of enum
        //
        // if (clazz.isEnum()) {
        //    throw new IllegalArgumentException(
        //        "Cannot reflectively create enum objects");
        //}
    }
}
