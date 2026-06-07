package creational.factory;

public class SmsNotificationFactory  implements NotificationFactory{

    public Notification createNotification() {
        return new SmsNotification();
    }
}
