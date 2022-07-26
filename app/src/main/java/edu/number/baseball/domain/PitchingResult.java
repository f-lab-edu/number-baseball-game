package edu.number.baseball.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PitchingResult {
    private int strike;
    private int ball;

    @Override
    public String toString() {
        return "스트라이크 : " + strike +
                ", 볼 :" + ball + "\n";
    }
}
