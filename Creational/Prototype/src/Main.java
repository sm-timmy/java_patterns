import model.Rat;

public class Main {
    public static void main(String[] args) {
        //Create a new rat and train it a bit
        Rat rat = new Rat(2, 40);

        rat.performExperiment("Read her a Book");
        System.out.println("Rat iq after a book:\t\t" + rat.getIqLevel());

        //Clone it
        Rat ratCopy = rat.cloneObject();

        //Continue experiment with first rat
        rat.performExperiment("Read her Another Book");
        System.out.println("Rat iq after another book:\t" + rat.getIqLevel());

        //Perform other experiment with ratCopy and count efficiency
        ratCopy.performExperiment("Play her a song:\t");
        System.out.println("RatCopy iq after a song:\t" + ratCopy.getIqLevel());
    }
}