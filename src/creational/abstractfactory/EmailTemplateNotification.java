package creational.abstractfactory;

public class EmailTemplateNotification implements TemplateNotification {
    public void createTemplate(){
        System.out.println("EmailTemplateNotification");
    }
}
