package creational.factory;

public class SmsNotification implements Notification{
    public SmsNotification() {
        System.out.println("create SmsNotification");
    }
    @Override
    public void sendMessage(String msg) {
        System.out.println("SmsNotification");
    }
}
