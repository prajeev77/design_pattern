package creational.abstractfactory;

public class SmsNotificationFactory implements NotificationServiceFactory{

    public TemplateNotification createTemplate(){
        return new SmsTemplateNotification();
    }

    @Override
    public ValidateNotification createValidation() {
        return new SmsValidationNotification();
    }

}
