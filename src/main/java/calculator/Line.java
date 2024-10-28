package calculator;

public class Line {
    private final Coordinate start;
    private final Coordinate end;

    public Line(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    public double getDistance() {
        int x = start.distanceXFrom(end);
        int y = start.distanceYFrom(end);
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
