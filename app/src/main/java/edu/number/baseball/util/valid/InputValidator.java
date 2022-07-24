package edu.number.baseball.util.valid;

public class InputValidator {

    /**
     * 총 글자 수가 3글자이며
     * 각 글자가 숫자형식(0~9)인지 확인한다.
     */
    public static boolean validInputNumbers(String inputNumber) {
        boolean isDigit = true;
        char[] chars = inputNumber.toCharArray();

        if (chars.length != 3) return false;
        for (int i = 0; i < 3; i++) {
            isDigit = isDigit && Character.isDigit(chars[i]);
        }
        return isDigit;
    }

}
