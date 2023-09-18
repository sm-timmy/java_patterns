package model;

public class BodyBuilder {
    private Body body;

    public BodyBuilder() {
        reset();
    }

    void addArms(int armsCount) {
        for (int i = 0; i < armsCount; i++)
            body.addArm();
    }

    void addLegs(int legsCount) {
        for (int i = 0; i < legsCount; i++)
            body.addLeg();
    }

    void addTail() {
        body.addTail();
    }

    void reset() {
        body = new Body();
    }

    public Body getBody() {
        return body;
    }
}
