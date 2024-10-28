package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class CoordinateTest {

    @Test
    @DisplayName("X좌표간 거리를 반환한다.")
    void distanceXFrom() {
        // given
        Point x1 = new Point(0);
        Point y1 = new Point(0);
        Point x2 = new Point(1);
        Point y2 = new Point(2);

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
        Point x1 = new Point(0);
        Point y1 = new Point(0);
        Point x2 = new Point(1);
        Point y2 = new Point(2);

        Coordinate c = new Coordinate(x1, y1);

        // when
        int distance = c.distanceYFrom(new Coordinate(x2, y2));

        // then
        assertThat(distance).isEqualTo(2);
    }

    @Test
    @DisplayName("compareTo 로 비교시 x 좌표 오름차순, y 좌표 오름차순 결과가 나오게 한다.")
    void compareTo() {
        // given
        Coordinate c1 = new Coordinate(new Point(0), new Point(0));
        Coordinate c2 = new Coordinate(new Point(0), new Point(1));
        Coordinate c3 = new Coordinate(new Point(1), new Point(0));

        // when
        int result1 = c1.compareTo(c2);
        int result2 = c2.compareTo(c1);
        int result3 = c1.compareTo(c3);

        // then
        assertThat(result1).isEqualTo(-1);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(-1);
    }

    @Test
    @DisplayName("정렬시 x좌표 오름차순, y좌표 오름차순 순으로 정렬한다.")
    void sort() {
        // given
        Coordinate[] coordinates = new Coordinate[4];

        Coordinate c1 = new Coordinate(new Point(0), new Point(0));
        Coordinate c2 = new Coordinate(new Point(0), new Point(1));
        Coordinate c3 = new Coordinate(new Point(1), new Point(0));
        Coordinate c4 = new Coordinate(new Point(1), new Point(1));

        coordinates[0] = c1;
        coordinates[1] = c2;
        coordinates[2] = c3;
        coordinates[3] = c4;

        // when
        Arrays.sort(coordinates);

        // then
        assertThat(coordinates).containsExactly(c1, c2, c3, c4);
    }
  
}