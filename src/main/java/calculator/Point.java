package calculator;

import java.util.Objects;

public class Point {
    private final int position;

    public Point(int position) {
        if (position > 24) throw new IllegalArgumentException("Position must be less than 24");
        this.position = position;
    }

    public int gapFrom(Point other) {
        return this.position - other.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point1 = (Point) o;
        return position == point1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(position);
    }
}
