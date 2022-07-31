package edu.number.baseball.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PitchingResult {
    public static final int SUCCESS_CUT_NUMBER = 3;
    private int strike;
    private int ball;

    @Override
    public String toString() {
        return "스트라이크 : " + strike +
                ", 볼 :" + ball + "\n";
    }

    public boolean isVictory() {
        return strike == SUCCESS_CUT_NUMBER;
    }
}
