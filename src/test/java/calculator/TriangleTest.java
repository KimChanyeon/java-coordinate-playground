package calculator;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("중복 좌표로는 삼각형을 생성할 수 없다.")
    void constructor_fail() {
        // given
        Coordinate c1 = new Coordinate(new Point(0), new Point(0));
        Coordinate c2 = new Coordinate(new Point(1), new Point(1));
        Coordinate c3 = new Coordinate(new Point(1), new Point(1));

        // when // then
        assertThatThrownBy(() -> new Triangle(c1, c2, c3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Coordinates are duplicated");
    }

    @Test
    @DisplayName("삼각형의 넓이를 계산한다.")
    void getArea() {
        // given
        Coordinate c1 = new Coordinate(new Point(0), new Point(0));
        Coordinate c2 = new Coordinate(new Point(0), new Point(1));
        Coordinate c3 = new Coordinate(new Point(1), new Point(1));

        // when
        Triangle triangle = new Triangle(c1, c2, c3);
        double area = triangle.getArea();

        // then
        assertThat(area).isEqualTo(0.5, Offset.offset(0.0001));
    }
}