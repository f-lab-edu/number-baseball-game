package edu.number.baseball.util.valid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    @DisplayName("validInputNumbers 로직 테스트 -  nnn 형태의 입력 ( n은 10보다 작은 자연수 ) ")
    void validInputNumbers_01() {
        String target = "145";

        boolean flag = InputValidator.validInputNumbers(target);

        assertTrue(flag);
    }

    /**
     * cnn 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 )
     * 문자열 길이가 3인 target의 처음에 비정상 문자 포함
     */
    @Test
    @DisplayName("validInputNumbers 로직 테스트 - cnn 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 ) ")
    void validInputNumbers_02() {
        String target = "a45";

        boolean flag = InputValidator.validInputNumbers(target);

        assertFalse(flag);
    }


    /**
     * ncn 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 )
     * 문자열 길이가 3인 target의 중간에 비정상 문자 포함
     */
    @Test
    @DisplayName("validInputNumbers 로직 테스트 - ncn 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 ) ")
    void validInputNumbers_03() {
        String target = "1b5";

        boolean flag = InputValidator.validInputNumbers(target);

        assertFalse(flag);
    }

    /**
     * nnc 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 )
     * 문자열 길이가 3인 target의 마지막에 비정상 문자 포함
     */
    @Test
    @DisplayName("validInputNumbers 로직 테스트 - nnc 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 ) ")
    void validInputNumbers_04() {
        String target = "14c";

        boolean flag = InputValidator.validInputNumbers(target);

        assertFalse(flag);

    }

    /**
     * target 이 4자 이상의 입력 값일 때의 return 확인
     */
    @Test
    @DisplayName("validInputNumbers 로직 테스트 - nnnc 형태의 입력 ( n은 10보다 작은 자연수, c는 문자 ) ")
    void validInputNumbers_05() {
        String target = "145d";

        boolean flag = InputValidator.validInputNumbers(target);

        assertFalse(flag);
    }
}