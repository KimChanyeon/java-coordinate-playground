package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CoordinateTest {

    @Test
    @DisplayName("X좌표간 거리를 반환한다.")
    void distanceXFrom() {
        // given
        Position x1 = new Position(0);
        Position y1 = new Position(0);
        Position x2 = new Position(1);
        Position y2 = new Position(2);

        Coordinate c = new Coordinate(x1, y1);

        // when
        int distance = c.distanceXFrom(new Coordinate(x2, y2));

        // then
        assertThat(distance).isEqualTo(1);
    }

    @Test
    @DisplayName("Y좌표간 거리를 반환한다.")
    void distanceYFrom() {
        // given
        Position x1 = new Position(0);
        Position y1 = new Position(0);
        Position x2 = new Position(1);
        Position y2 = new Position(2);

        Coordinate c = new Coordinate(x1, y1);

        // when
        int distance = c.distanceYFrom(new Coordinate(x2, y2));

        // then
        assertThat(distance).isEqualTo(2);
    }
  
}