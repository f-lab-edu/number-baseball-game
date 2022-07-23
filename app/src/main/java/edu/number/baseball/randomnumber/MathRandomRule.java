package edu.number.baseball.randomnumber;

import java.util.ArrayList;
import java.util.List;

public class MathRandomRule implements RandomNumberGenerationRule{
    @Override
    public List<Integer> create(int size) {
        List<Integer> numbers = new ArrayList<>();
        while(size > numbers.size()) {
            Integer randomNumber = (int)(Math.random() * 9) + 1;
            if(!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
