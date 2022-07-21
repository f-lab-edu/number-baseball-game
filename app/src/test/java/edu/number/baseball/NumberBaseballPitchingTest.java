package edu.number.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        Numbers targetNumbers = new TargetNumbers();
        NumberBaseballPitching numberBaseballPitching = new NumberBaseballPitching(targetNumbers);
        Numbers inputNumbers = new TargetNumbers(targetNumbers.toString());
        PitchingResult numberBaseballPitching.pitching(inputNumbers);
        assertEquals(targetNumbers.toString().length(), 3);
    }
}
