package model;

public class Person {
    int age;
    String email;
    String name;
    String lastname;

    public Person(int age, String email, String name, String lastname) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String toJson() {
        return JsonAdapter.JavaToJson(toString());
    }
}
