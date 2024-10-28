package calculator;

public class Position {
    private final int position;

    public Position(int position) {
        if (position > 24) throw new IllegalArgumentException("Position must be less than 24");
        this.position = position;
    }


    public int gapFrom(Position other) {
        return this.position - other.position;
    }
}
