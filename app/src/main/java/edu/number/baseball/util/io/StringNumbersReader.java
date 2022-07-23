package edu.number.baseball.util.io;

import edu.number.baseball.domain.InputNumbers;

import java.util.Scanner;

public class StringNumbersReader implements NumbersReader{

    @Override
    public InputNumbers readNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("서로 다른 세 수(0 ~ 9)를 입력하세요");
        String inputNumbers = reader.nextLine();
        return InputNumbers.createInputNumberSequenceWithString(inputNumbers);
    }
}
