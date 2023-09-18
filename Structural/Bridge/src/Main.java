import model.GeometricCalculator;
import model.Point;
import model.Vector;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        Vector vector = new Vector(point1, point2);
        double length = GeometricCalculator.getVectorLength(vector);
        System.out.println("Vector length is: " + length);
    }
}