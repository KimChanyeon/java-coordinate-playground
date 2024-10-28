package calculator;

import java.util.Arrays;

public class Rectangle {

    public static final int SIZE = 4;
    private final Coordinate[] coordinates = new Coordinate[SIZE];

    public Rectangle(Coordinate c1, Coordinate c2, Coordinate c3, Coordinate c4) {
        coordinates[0] = c1;
        coordinates[1] = c2;
        coordinates[2] = c3;
        coordinates[3] = c4;
        Arrays.sort(coordinates);
        if (!isRectangle()) {
            throw new IllegalArgumentException("Only Rectangle Is Accepted");
        }
    }

    private boolean isRectangle() {
        return !Util.isDuplicate(coordinates) && isRectangular();
    }

    public int getArea() {
        return coordinates[0].distanceXFrom(coordinates[2]) * coordinates[0].distanceYFrom(coordinates[1]);
    }

    private boolean isRectangular() {
        if (coordinates[0].distanceXFrom(coordinates[1]) != 0) {
            return false;
        }
        if (coordinates[2].distanceXFrom(coordinates[3]) != 0) {
            return false;
        }
        if (coordinates[0].distanceYFrom(coordinates[2]) != 0) {
            return false;
        }
        return coordinates[1].distanceYFrom(coordinates[3]) == 0;
    }
}
