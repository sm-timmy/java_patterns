package model;

public class GeometricCalculator {
    public static double getVectorLength(Vector vector) {
        return
                Math.sqrt(
                   Math.pow(vector.point2.getX() - vector.point1.getX(), 2) +
                   Math.pow(vector.point2.getY() - vector.point1.getY(), 2)
                );
    }
}
