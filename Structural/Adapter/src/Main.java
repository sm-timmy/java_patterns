import model.JsonAdapter;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(31, "paul.clark@gmail.com", "Paul", "Clark");

        String personToString = person.toString();
        System.out.println(personToString);

        String personToJson = person.toJson();
        System.out.println(personToJson);
    }
}