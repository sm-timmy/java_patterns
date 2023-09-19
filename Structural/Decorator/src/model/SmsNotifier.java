package model;
//Concrete additional behaviour
public class SmsNotifier extends BaseNotifier{

    public SmsNotifier(SentryNotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("SMS message :: " + message);
    }
}
