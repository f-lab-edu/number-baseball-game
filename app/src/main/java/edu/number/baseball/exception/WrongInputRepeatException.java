package edu.number.baseball.exception;

public class WrongInputRepeatException extends RuntimeException{
    public WrongInputRepeatException() {
        super("입력 횟수 초과 오류 입니다.");
    }

    public WrongInputRepeatException(String message) {
        super(message);
    }

    public WrongInputRepeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongInputRepeatException(Throwable cause) {
        super(cause);
    }

    protected WrongInputRepeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
