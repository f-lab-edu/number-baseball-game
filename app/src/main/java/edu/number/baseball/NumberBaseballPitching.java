package edu.number.baseball;

import java.util.List;

public class NumberBaseballPitching {

    private final Numbers targetNumbers;
    private static NumberBaseballPitching singleton;

    private NumberBaseballPitching(Numbers targetNumbers){
        this.targetNumbers = targetNumbers;
    }

    public static NumberBaseballPitching getInstance(Numbers targetNumbers){
        // AGJ : This application has a single thread
        if(singleton == null){
            singleton = new NumberBaseballPitching(targetNumbers);
        }
        return singleton;
    }

    public PitchingResult pitching(Numbers numbers){
        int ball = 0;
        int strike = 0;
        List<Integer> inputs = numbers.getNumbers();
        for(int i = 0 ; i < inputs.size(); i++){
            if(inputs.get(i).equals(targetNumbers.getNumbers().get(i))){
                strike++;
            }else if(!inputs.get(i).equals(targetNumbers.getNumbers().get(i))
            && targetNumbers.getNumbers().contains(inputs.get(i))){
                ball++;
            }
        }

        return PitchingResult.builder().ball(ball).strike(strike).build();

    }
}
