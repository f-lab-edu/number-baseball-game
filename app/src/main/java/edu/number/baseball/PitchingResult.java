package edu.number.baseball;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PitchingResult {
    private int strike;
    private int ball;
    private int out;
}
