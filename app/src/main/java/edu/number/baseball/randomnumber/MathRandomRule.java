package edu.number.baseball.randomnumber;

import java.util.ArrayList;
import java.util.List;

public class MathRandomRule implements RandomNumberGenerationRule{
    @Override
    public List<Integer> create(int size) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add((int)(Math.random() * 9) + 1);
        }
        return numbers;
    }
}
