package model.project;

import model.building.Building;
import model.building.House;

public class SmallHouseProject extends Project {
    @Override
    public Building createBuilding() {
        return new House(2.4, 2.5, 6, 15000 );
    }
}
