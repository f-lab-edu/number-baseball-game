package edu.number.baseball.util.io;

import edu.number.baseball.domain.InputNumbers;
import edu.number.baseball.exception.WrongInputRepeatException;

import java.util.Scanner;

import static edu.number.baseball.util.valid.InputValidator.*;

public class StringNumbersReader implements NumbersReader{
    private final Scanner reader;

    public StringNumbersReader() {
        this.reader = new Scanner(System.in);
    }

    @Override
    public InputNumbers readNumber() {
        boolean flag = false;
        String inputNumbers = "";
        int count = 1;

        while (!flag){
            // validate the number of inputs
            verifyNumberOfInput(count);

            // input number
            System.out.println("서로 다른 세 수(0 ~ 9)를 입력하세요");
            inputNumbers = reader.nextLine();

            // validation of input data
            flag = validInputNumbers(inputNumbers);
            count++;
        };
        return InputNumbers.createInputNumberSequenceWithString(inputNumbers);
    }

    // An error is returned when the input fails more than 5 times.
    private void verifyNumberOfInput(int count) {
        if (count >= 5) throw new WrongInputRepeatException();
    }

}
