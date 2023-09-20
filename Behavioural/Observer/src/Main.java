import model.Abonent;
import model.MobileOperator;

public class Main {
    public static void main(String[] args) {
        MobileOperator mobileOperator = new MobileOperator("Vodafone");

        Abonent abonent1 = new Abonent("+79771778686");
        mobileOperator.subscribe(abonent1);
        Abonent abonent2 = new Abonent("+79771778687");
        mobileOperator.subscribe(abonent2);

        mobileOperator.sendPromotion("Extra sale! Get free year as a gift.");
    }
}