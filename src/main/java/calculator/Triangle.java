package calculator;

public class Triangle {

    public static final int SIZE = 3;
    private final Coordinate[] coordinates = new Coordinate[SIZE];

    public Triangle(Coordinate c1, Coordinate c2, Coordinate c3) {
        coordinates[0] = c1;
        coordinates[1] = c2;
        coordinates[2] = c3;
        if (Util.isDuplicate(coordinates)) {
            throw new IllegalArgumentException("Coordinates are duplicated");
        }
    }

    public double getArea() {
        return calculateTriangleArea();
    }

    private double calculateTriangleArea() {
        double d1 = new Line(coordinates[0], coordinates[1]).getDistance();
        double d2 = new Line(coordinates[0], coordinates[2]).getDistance();
        double d3 = new Line(coordinates[1], coordinates[2]).getDistance();

        double s = (d1 + d2 + d3) / 2;

        return Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));
    }
}
