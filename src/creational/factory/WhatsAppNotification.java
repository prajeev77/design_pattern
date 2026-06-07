package creational.factory;

public class WhatsAppNotification implements Notification {
    public WhatsAppNotification() {
        System.out.println("create WhatsAppNotification");
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsAppNotification");
    }
}
