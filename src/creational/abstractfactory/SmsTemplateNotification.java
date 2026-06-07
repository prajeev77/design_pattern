package creational.abstractfactory;

public class SmsTemplateNotification implements TemplateNotification {
    public void createTemplate(){
        System.out.println("SmsTemplateNotification");
    }
}
