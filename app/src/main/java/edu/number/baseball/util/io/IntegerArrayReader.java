package edu.number.baseball.util.io;

import edu.number.baseball.domain.InputNumbers;

import java.util.Scanner;


public class IntegerArrayReader implements NumbersReader{
    private final Scanner reader;

    public IntegerArrayReader() {
        this.reader = new Scanner(System.in);
    }
    @Override
    public InputNumbers readNumber() {

        return null;
    }
}
