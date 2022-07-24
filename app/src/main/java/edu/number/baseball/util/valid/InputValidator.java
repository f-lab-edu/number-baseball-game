package edu.number.baseball.util.valid;

public class InputValidator {

    /**
     * 총 글자 수가 3글자이며
     * 각 글자가 숫자형식(0~9)인지 확인한다.
     */
    public static boolean validInputNumbers(String inputNumber) {
        boolean isDigit = false;
        char[] chars = inputNumber.toCharArray();

        for (char ch : chars) {
            isDigit = isDigit && Character.isDigit(ch);
        }
        return isDigit && (inputNumber.length() == 3);
    }

}
