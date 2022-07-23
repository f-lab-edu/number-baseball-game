package edu.number.baseball;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class PitchingResult {
    private int strike;
    private int ball;

    @Override
    public String toString() {
        return "PitchingResult{" +
                "strike=" + strike +
                ", ball=" + ball +
                '}';
    }
}
