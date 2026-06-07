package creational.abstractfactory;

public class NotificationServiceClient {
    public static void main(String[] args) {

        NotificationServiceFactory serviceFactory = new EmailNotificationFactory();
        System.out.println(serviceFactory.createValidation());
        System.out.println(serviceFactory.createTemplate());
    }
}
