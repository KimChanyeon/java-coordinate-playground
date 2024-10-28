package calculator;

public class Coordinate {
    private final Position x;
    private final Position y;

    public Coordinate(Position x, Position y) {
        this.x = x;
        this.y = y;
    }

    public int distanceXFrom(Coordinate coordinate) {
        return Math.abs(x.gapFrom(coordinate.x));
    }

    public int distanceYFrom(Coordinate coordinate) {
        return Math.abs(y.gapFrom(coordinate.y));
    }
}
