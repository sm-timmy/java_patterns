package model.building;

public class SwimmingPool implements Building{
    private final double width;
    private final double height;
    private final double depth;
    private final double diggingPriceMultiplier;
    private final double diggingDifficultyMultiplier;

    public SwimmingPool(double width, double height, double depth, double diggingPriceMultiplier, double diggingDifficultyMultiplier) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.diggingPriceMultiplier = diggingPriceMultiplier;
        this.diggingDifficultyMultiplier = diggingDifficultyMultiplier;
    }

    public double countBuildingPrice() {
        return diggingDifficultyMultiplier * diggingPriceMultiplier * width * height * depth;
    }
}
