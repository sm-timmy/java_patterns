package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rat extends Animal {
    private List<String> experiments;
    private int iqLevel;
    public Rat(Rat source) {
        super(source);
        this.iqLevel = source.iqLevel;
        experiments = source.experiments;
    }

    public Rat(int weight, int iqLevel) {
        super(weight);
        this.iqLevel = iqLevel;
        experiments = new ArrayList<>();
    }

    public Rat cloneObject() {
        return new Rat(this);
    }
    public void recalculateIq() {
        Random random = new Random();
        iqLevel += random.nextInt(5);
    }

    public void performExperiment(String experiment) {
        experiments.add(experiment);
        recalculateIq();
    }
    public List<String> getExperiments() {
        return experiments;
    }
    public int getIqLevel() {
        return iqLevel;
    }

}
