package calculator;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LineTest {

    @Test
    @DisplayName("직선의 거리를 계산한다.")
    void getDistance() {
        // given
        Position x1 = new Position(0);
        Position y1 = new Position(0);

        Position x2 = new Position(1);
        Position y2 = new Position(1);

        Coordinate x = new Coordinate(x1, y1);
        Coordinate y = new Coordinate(x2, y2);

        Line line = new Line(x, y);

        // when
        double distance = line.getDistance();

        // then
        assertThat(distance).isEqualTo(Math.sqrt(2.0), Offset.offset(0.0001));
    }

}