package edu.number.baseball;

public class NumberBaseballPitching {

    private Numbers numbers;

    public NumberBaseballPitching(Numbers targetNumbers){
        numbers = targetNumbers;
    }

    public PitchingResult pitching(Numbers numbers){
        return PitchingResult.builder().ball(1).strike(1).strike(1).build();

    }
}
