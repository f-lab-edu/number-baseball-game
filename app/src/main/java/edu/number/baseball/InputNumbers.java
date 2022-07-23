package edu.number.baseball;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InputNumbers implements Numbers{

    private final List<Integer> numbers = new ArrayList<>();

    private InputNumbers(){
        System.out.println("[Error] This is private, something wrong -- Need Input");
    }
    private InputNumbers(List<Integer> inputs){
        numbers.addAll(inputs);
    }
    private InputNumbers(String inputs){
        try{
            Integer.parseInt(inputs);
            for (char input: inputs.toCharArray()) {
                numbers.add(input - '0');
            }
        }catch (NumberFormatException e){
            System.out.println(e.getMessage() + "-- Need Input");
        }

    }

    public static InputNumbers createInputNumberSequenceWithList(List<Integer> inputs){
        return new InputNumbers(inputs);
    }

    public static InputNumbers createInputNumberSequenceWithString(String inputs){
        return new InputNumbers(inputs);
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
