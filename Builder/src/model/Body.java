package model;

public class Body {
    private int arms;
    private int legs;
    private boolean hasTail;

    Body () {
        arms = 0;
        legs = 0;
        hasTail = false;
    }

    void addArm() {
        arms++;
    }

    void addLeg() {
        legs++;
    }

    void addTail() {
        hasTail = true;
    }

    @Override
    public String toString() {
        return "Body:" +
                "\narms=" + arms +
                "\nlegs=" + legs +
                "\nhasTail=" + hasTail + "\n";
    }
}
