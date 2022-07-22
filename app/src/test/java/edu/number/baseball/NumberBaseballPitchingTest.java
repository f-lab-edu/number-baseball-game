package edu.number.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NumberBaseballPitchingTest {
    @Test
    @DisplayName("Create random number")
    void createTargetRandomNumber(){
        Numbers targetNumbers = TargetNumbers.createNewRandomNumberSequence();
        System.out.println(targetNumbers);
        assertEquals(targetNumbers.toString().length(), 3);
    }

    @Test
    @DisplayName("Create random number with list")
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
