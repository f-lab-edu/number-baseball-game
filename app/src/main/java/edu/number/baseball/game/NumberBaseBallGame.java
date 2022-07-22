package edu.number.baseball.game;

import edu.number.baseball.*;

public class NumberBaseBallGame {

    public void run() {
        int isContinue = 9;
        // Create Target Numbers
        NumberBaseballPitching numberBaseballPitching
                = NumberBaseballPitching.getInstance(TargetNumbers.createNewRandomNumberSequence());

        while (isContinue-- > 0) {
            // TODO Input

            // AGJ : pitching
            Numbers inputNumbers = InputNumbers.createInputNumberSequenceWithString("135");
            PitchingResult pitchingResult = numberBaseballPitching.pitching(inputNumbers);
            System.out.println(isContinue + " left");
            System.out.println(pitchingResult);

        }
    }
}
