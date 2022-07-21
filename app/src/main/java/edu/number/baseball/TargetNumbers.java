package edu.number.baseball;

import java.util.ArrayList;
import java.util.List;

public class TargetNumbers implements Numbers{
    private static final int MAX = 3;
    private final List<Integer> numbers = new ArrayList<>();

    public TargetNumbers(){
        createNumbers();
    }
    public TargetNumbers(List<Integer> inputs){
        numbers.addAll(inputs);
    }
    public TargetNumbers(String inputs){
        try{
            Integer.parseInt(inputs);
            for (char input: inputs.toCharArray()) {
                numbers.add(input - '0');
            }
        }catch (Exception ignore){
            createNumbers();
        }

    }

    private void createNumbers(){
        for (int i = 0; i < MAX; i++) {
            numbers.add((int)(Math.random() * 10));
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
