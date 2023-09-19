import model.*;

public class Main {
    public static void main(String[] args) {
        SentryNotifier notifier = new BaseNotifier(new EmailNotifier());
        notifier.sendNotification("Alert! Critical error happened");
        notifier = new SmsNotifier(notifier);
        notifier.sendNotification("Alert! Your app is down");
        notifier = new PhoneCallNotifier(notifier);
        notifier.sendNotification("Alert! Cannot restart your application");
    }
}