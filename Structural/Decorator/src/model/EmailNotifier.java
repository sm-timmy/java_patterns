package model;
//Default behaviour
public class EmailNotifier implements SentryNotifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("EMAIL message :: " + message);
    }
}
