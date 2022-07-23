package edu.number.baseball.domain;

import edu.number.baseball.randomnumber.RandomNumberGenerationRule;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TargetNumbers implements Numbers{
    private static final int MAX = 3;
    private final List<Integer> numbers = new ArrayList<>();
    private final RandomNumberGenerationRule randomNumberGenerationRule;

    private TargetNumbers(RandomNumberGenerationRule randomNumberGenerationRule){
        this.randomNumberGenerationRule = randomNumberGenerationRule;
        this.numbers.addAll(randomNumberGenerationRule.create(MAX));
    }
    public static TargetNumbers createNewRandomNumberSequence(RandomNumberGenerationRule randomNumberGenerationRule){
        return new TargetNumbers(randomNumberGenerationRule);
    }

    // TODO we can create numbers with various strategy, issue #4
    private void createNumbers(){
        for (int i = 0; i < MAX; i++) {
            numbers.add((int)(Math.random() * 9) + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder numberSequence = new StringBuilder();
        for(Integer one : numbers){
            numberSequence.append(one.toString());
        }
        return numberSequence.toString();
    }
}
