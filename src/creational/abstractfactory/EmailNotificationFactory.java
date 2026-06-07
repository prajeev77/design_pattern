package creational.abstractfactory;

public class EmailNotificationFactory implements  NotificationServiceFactory{

    public TemplateNotification createTemplate(){
        return new EmailTemplateNotification();
    }

    @Override
    public ValidateNotification createValidation() {
        return new EmailValidationNotification();
    }
}
