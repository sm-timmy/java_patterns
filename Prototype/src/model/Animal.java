package model;

abstract public class Animal {
    private final int weight;
    Animal(Animal source) {
        this.weight = source.weight;
    }
    Animal(int weight) {
        this.weight = weight;
    }
    abstract Animal cloneObject();
}
