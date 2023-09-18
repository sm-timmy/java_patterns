package model;

public class BodyDirector {
    BodyBuilder bodyBuilder;
    public BodyDirector(BodyBuilder inBuilder) {
        bodyBuilder = inBuilder;
    }

    public void buildDevil() {
        bodyBuilder.addArms(2);
        bodyBuilder.addLegs(2);
        bodyBuilder.addTail();
    }

    public void buildHumanoid() {
        bodyBuilder.addArms(6);
        bodyBuilder.addLegs(1);
    }

    public void reset() {
        bodyBuilder.reset();
    }
}
