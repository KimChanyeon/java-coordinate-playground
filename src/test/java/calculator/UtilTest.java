package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UtilTest {

    @Test
    @DisplayName("객체배열에 중복값이 있는지 확인한다.")
    void isDuplicate() {
        // given
        String[] arr = new String[2];
        arr[0] = "hello";
        arr[1] = "hello";

        // when
        boolean isDuplicate = Util.isDuplicate(arr);

        // then
        assertThat(isDuplicate).isTrue();
    }

}