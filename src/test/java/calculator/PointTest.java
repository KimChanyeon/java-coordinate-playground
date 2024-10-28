package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    @DisplayName("생성시 위치값은 최대 24까지만 허용된다.")
    void constructor_fail() {
        // given // when // then
        assertThatThrownBy(() -> new Point(25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Position must be less than 24");
    }

    @Test
    @DisplayName("두 지점간의 차이를 반환한다.")
    void gapFrom() {
        // given
        Point point = new Point(1);

        // when
        int gap = point.gapFrom(new Point(2));

        // then
        assertThat(gap).isEqualTo(-1);
    }

}