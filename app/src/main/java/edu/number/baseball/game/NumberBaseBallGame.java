package edu.number.baseball.game;

import edu.number.baseball.*;
import edu.number.baseball.domain.InputNumbers;
import edu.number.baseball.domain.Numbers;
import edu.number.baseball.domain.PitchingResult;
import edu.number.baseball.domain.TargetNumbers;
import edu.number.baseball.randomnumber.MathRandomRule;
import edu.number.baseball.util.io.NumbersReader;
import edu.number.baseball.util.io.StringNumbersReader;
import edu.number.baseball.util.io.write.ResultFileWrite;

public class NumberBaseBallGame {

    public void run() {
        int isContinue = 9;
        // Create Target Numbers
        NumberBaseballPitching numberBaseballPitching
                = NumberBaseballPitching.getInstance(TargetNumbers.createNewRandomNumberSequence(new MathRandomRule()));
        NumbersReader numbersReader = new StringNumbersReader();

        while (isContinue-- > 0) {
            InputNumbers inputNumbers = numbersReader.readNumber();
            PitchingResult pitchingResult = numberBaseballPitching.pitching(inputNumbers);
            printResult(isContinue, pitchingResult);
            if (pitchingResult.isVictory()) break;
        }
    }

    private void printResult(int isContinue, PitchingResult pitchingResult) {
        int round = 9 - isContinue;
        String resultStr = round + " 회 :" + pitchingResult.toString();
        System.out.println(resultStr);
        ResultFileWrite.resultWrite(resultStr);
    }
}
