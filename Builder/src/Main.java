import model.BodyBuilder;
import model.BodyDirector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим дьявола");
        BodyBuilder bodyBuilder = new BodyBuilder();
        BodyDirector bodyDirector = new BodyDirector(bodyBuilder);
        bodyDirector.buildDevil();
        System.out.println(bodyBuilder.getBody());

        System.out.println("Создадим пришельца");
        bodyDirector.reset();
        bodyDirector.buildHumanoid();
        System.out.println(bodyBuilder.getBody());
    }
}