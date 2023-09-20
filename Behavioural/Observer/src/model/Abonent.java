package model;

public class Abonent implements Subscriber {
    String phoneNumber;

    public Abonent(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void getNotification(String notification) {
        System.out.println(phoneNumber + "::" + notification);
    }
}
