package model;
//Notification wrapper
public class BaseNotifier implements SentryNotifier {
    protected SentryNotifier notifier;

    public BaseNotifier(SentryNotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendNotification(String message) {
        notifier.sendNotification(message);
    }
}
