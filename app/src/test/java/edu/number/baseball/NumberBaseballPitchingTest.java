package edu.number.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class NumberBaseballPitchingTest {
    @Test
    @DisplayName("Create random number")
    void createTargetRandomNumber(){
        Numbers targetNumbers = new TargetNumbers();
        System.out.println(targetNumbers);
        assertEquals(targetNumbers.toString().length(), 3);
    }

    @Test
    @DisplayName("Create random number with list")
    void createTargetRandomNumberWithList(){
        Numbers targetNumbers = new TargetNumbers(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println(targetNumbers);
        assertEquals(targetNumbers.toString(), "123");
    }

    @Test
    @DisplayName("Create number with string")
    void createTargetRandomNumberWithString(){
        final String inputs = "123";
        Numbers targetNumbers = new TargetNumbers(inputs);
        System.out.println(targetNumbers);
        assertEquals(targetNumbers.toString(), inputs);
    }

    @Test
    @DisplayName("Create pitching rule class")
    void createPitchingRule(){
        Numbers targetNumbers = new TargetNumbers("123");
        NumberBaseballPitching numberBaseballPitching = new NumberBaseballPitching(targetNumbers);
        Numbers inputNumbers1 = new TargetNumbers(targetNumbers.toString());
        Numbers inputNumbers2 = new TargetNumbers("139");
        Numbers inputNumbers3 = new TargetNumbers("312");
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
