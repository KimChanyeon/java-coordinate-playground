package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사")
    void constructor_fail() {
        // given
        Point x1 = new Point(0);
        Point y1 = new Point(0);

        Point x2 = new Point(0);
        Point y2 = new Point(0);

        Point x3 = new Point(1);
        Point y3 = new Point(0);

        Point x4 = new Point(1);
        Point y4 = new Point(0);

        // when // then
        assertThatThrownBy(
                () -> new Rectangle(new Coordinate(x1, y1), new Coordinate(x2, y2), new Coordinate(x3, y3), new Coordinate(x4, y4))
        )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Only Rectangle Is Accepted");
    }

    @Test
    @DisplayName("사각형의 넓이를 계산한다.")
    void getArea() {
        // given
        Point x1 = new Point(0);
        Point y1 = new Point(0);

        Point x2 = new Point(0);
        Point y2 = new Point(2);

        Point x3 = new Point(2);
        Point y3 = new Point(0);

        Point x4 = new Point(2);
        Point y4 = new Point(2);

        Rectangle rectangle = new Rectangle(new Coordinate(x1, y1), new Coordinate(x2, y2), new Coordinate(x3, y3), new Coordinate(x4, y4));

        // when
        int area = rectangle.getArea();

        // then
        assertThat(area).isEqualTo(4);
    }

}