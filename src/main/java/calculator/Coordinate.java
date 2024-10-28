package calculator;

import java.util.Objects;

public class Coordinate implements Comparable<Coordinate> {
    private final Point x;
    private final Point y;

    public Coordinate(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public int distanceXFrom(Coordinate other) {
        return Math.abs(x.gapFrom(other.x));
    }

    public int distanceYFrom(Coordinate other) {
        return Math.abs(y.gapFrom(other.y));
    }

    @Override
    public int compareTo(Coordinate other) {
        return x.gapFrom(other.x) == 0 ? y.gapFrom(other.y) : x.gapFrom(other.x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
