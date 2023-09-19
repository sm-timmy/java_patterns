package model;
//Concrete additional behaviour
public class PhoneCallNotifier extends BaseNotifier{

    public PhoneCallNotifier(SentryNotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Phone call :: " + message);
    }
}
