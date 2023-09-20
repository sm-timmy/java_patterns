package model;

import java.util.ArrayList;
import java.util.List;

public class MobileOperator {
    String name;
    List<Subscriber> abonents;

    public MobileOperator(String name) {
        this.name = name;
        abonents = new ArrayList<>();
    }

    public void subscribe(Subscriber abonent) {
        abonents.add(abonent);
    }

    void unsubscribe(Subscriber abonent) {
        abonents.remove(abonent);
    }

    public void sendPromotion(String promotionText) {
        for (Subscriber abonent: abonents) {
            abonent.getNotification(promotionText);
        }
    }
}
