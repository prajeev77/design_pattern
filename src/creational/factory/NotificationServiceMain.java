package creational.factory;

public class NotificationServiceMain {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new SmsNotificationFactory();
        notificationFactory.createNotification();

    }
}
