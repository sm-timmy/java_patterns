import model.factory.CasualSuitFactory;
import model.factory.WeddingSuitFactory;
import model.item.CasualJacket;
import model.item.Jacket;
import model.item.Shoes;

public class Main {
    public static void main(String[] args) {
        CasualSuitFactory casualSuitFactory = new CasualSuitFactory();
        Jacket casualJacket = casualSuitFactory.makeJacket();
        System.out.printf("Приобрести повседневный пиджак [%s]\n", casualJacket.getClass());
        casualJacket.setSize(49);
        System.out.printf("Подходит ли на 50 размер? %b\n\n", casualJacket.isFit(50));


        WeddingSuitFactory weddingSuitFactory = new WeddingSuitFactory();
        Jacket weddingJacket = weddingSuitFactory.makeJacket();
        System.out.printf("Приобрести свадебный пиджак [%s]\n", weddingJacket.getClass());
        weddingJacket.setSize(49);
        System.out.printf("Подходит ли на 50 размер? %b\n\n", weddingJacket.isFit(50));

        Shoes weddingShoes = weddingSuitFactory.makeShoes();
        System.out.printf("Приобрести свадебные туфли [%s]", weddingShoes.getClass());
    }
}