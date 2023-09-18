package model.building;

public class House implements Building{
    private final double length;
    private final double width;
    private final double height;
    private final double buildingMaterialsMultiplier;

    public House(double length, double width, double height, double buildingMaterialsMultiplier) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.buildingMaterialsMultiplier = buildingMaterialsMultiplier;
    }

    public double countBuildingPrice() {
        return length* width * height * buildingMaterialsMultiplier;
    }
}
