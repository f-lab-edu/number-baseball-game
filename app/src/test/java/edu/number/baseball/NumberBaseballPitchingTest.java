package edu.number.baseball;

import edu.number.baseball.randomnumber.MathRandomRule;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class NumberBaseballPitchingTest {
    @Test
    @DisplayName("Create random number")
    void createTargetRandomNumber(){
        List<Integer> check = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for(int i = 0; i < 1000 ; i++){
            Numbers targetNumbers = TargetNumbers.createNewRandomNumberSequence(new MathRandomRule());
            Set<Integer> checkDup = new HashSet<>();
            for(int j = 0 ; j < targetNumbers.getNumbers().size(); j++){
                assertTrue(check.contains(targetNumbers.getNumbers().get(j)));
                checkDup.add(targetNumbers.getNumbers().get(j));
            }
            assertEquals(checkDup.size(), 3);
            assertEquals(targetNumbers.toString().length(), 3);
        }
    }

    @Test
    @DisplayName("Create number with list")
    void createInputNumberWithList(){
        Numbers inputNumbers = InputNumbers.createInputNumberSequenceWithList(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println(inputNumbers);
        assertEquals(inputNumbers.toString(), "123");
    }

    @Test
    @DisplayName("Create number with string")
    void createInputNumberWithString(){
        final String inputs = "123";
        Numbers inputNumbers = InputNumbers.createInputNumberSequenceWithString(inputs);
        System.out.println(inputNumbers);
        assertEquals(inputNumbers.toString(), inputs);
    }

    @Test
    @DisplayName("Create pitching rule class")
    void createPitchingRule(){
        Numbers targetNumbers = InputNumbers.createInputNumberSequenceWithString("123");
        NumberBaseballPitching numberBaseballPitching = NumberBaseballPitching.getInstance(targetNumbers);
        Numbers inputNumbers1 = InputNumbers.createInputNumberSequenceWithString(targetNumbers.toString());
        Numbers inputNumbers2 = InputNumbers.createInputNumberSequenceWithString("139");
        Numbers inputNumbers3 = InputNumbers.createInputNumberSequenceWithString("312");
        PitchingResult pitchingResult1 = numberBaseballPitching.pitching(inputNumbers1);
        PitchingResult pitchingResult2 = numberBaseballPitching.pitching(inputNumbers2);
        PitchingResult pitchingResult3 = numberBaseballPitching.pitching(inputNumbers3);

        assertEquals(pitchingResult1.getBall(), 0);
        assertEquals(pitchingResult1.getStrike(), 3);
        assertEquals(pitchingResult2.getBall(), 1);
        assertEquals(pitchingResult2.getStrike(), 1);
        assertEquals(pitchingResult3.getBall(), 3);
        assertEquals(pitchingResult3.getStrike(), 0);
    }
}
