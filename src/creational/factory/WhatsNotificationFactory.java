package creational.factory;

public class WhatsNotificationFactory implements NotificationFactory {

    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
