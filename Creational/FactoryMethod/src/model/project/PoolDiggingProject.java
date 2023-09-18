package model.project;

import model.building.Building;
import model.building.SwimmingPool;

public class PoolDiggingProject extends Project {

    @Override
    public Building createBuilding() {
        return new SwimmingPool(5, 5 , 5, 2500, 1.5 );
    }
}
