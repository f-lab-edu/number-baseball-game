package edu.number.baseball;

import edu.number.baseball.domain.Numbers;
import edu.number.baseball.domain.PitchingResult;
import lombok.Getter;

import java.util.List;

@Getter
public class NumberBaseballPitching {

    private final Numbers targetNumbers;

    private NumberBaseballPitching(Numbers targetNumbers){
        this.targetNumbers = targetNumbers;
    }

    public static NumberBaseballPitching getInstance(Numbers targetNumbers){
        return new NumberBaseballPitching(targetNumbers);
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
