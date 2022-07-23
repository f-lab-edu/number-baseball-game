package edu.number.baseball.util.io;

import edu.number.baseball.domain.InputNumbers;
import edu.number.baseball.exception.WrongInputRepeatException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NumbersReaderTest {

    @Test
    @DisplayName("문자열 입력(정상 케이스)")
    void stringReader() throws NoSuchFieldException, IllegalAccessException {
        StringNumbersReader reader = new StringNumbersReader();

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("245");

        mockingScanner(reader, mockScanner);

        InputNumbers inputNumbers = reader.readNumber();
        List<Integer> numbers = inputNumbers.getNumbers();

        assertEquals(numbers.size(), 3);
        assertAll(
                () -> assertEquals(numbers.get(0), 2),
                () -> assertEquals(numbers.get(1), 4),
                () -> assertEquals(numbers.get(2), 5)
        );
    }

    @Test
    @DisplayName("문자열 입력(비정상 케이스) 01 - 중복된 숫자가 포함 됨")
    void stringReader_ex01() throws NoSuchFieldException, IllegalAccessException {
        StringNumbersReader reader = new StringNumbersReader();

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("224", "233", "245");

        mockingScanner(reader, mockScanner);

        InputNumbers inputNumbers = reader.readNumber();
        List<Integer> numbers = inputNumbers.getNumbers();


        verify(mockScanner, times(3)).nextLine();
        assertEquals(numbers.size(), 3);
        assertAll(
                () -> assertEquals(numbers.get(0), 2),
                () -> assertEquals(numbers.get(1), 4),
                () -> assertEquals(numbers.get(2), 5)
        );
    }


    /**
     * Input Format -> nnn (n은 10보다 작은 자연수)
     */
    @Test
    @DisplayName("문자열 입력(비정상 케이스) 02 - 포맷에 맞지 않음")
    void stringReader_ex02() throws NoSuchFieldException, IllegalAccessException {
        StringNumbersReader reader = new StringNumbersReader();

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("stringValue", "233412451", "245");

        mockingScanner(reader, mockScanner);

        InputNumbers inputNumbers = reader.readNumber();
        List<Integer> numbers = inputNumbers.getNumbers();


        verify(mockScanner, times(3)).nextLine();
        assertEquals(numbers.size(), 3);
        assertAll(
                () -> assertEquals(numbers.get(0), 2),
                () -> assertEquals(numbers.get(1), 4),
                () -> assertEquals(numbers.get(2), 5)
        );
    }


    @Test
    @DisplayName("문자열 입력(비정상 케이스) 03 - 5번 이상 입력 실패 시 앱 종료")
    void stringReader_ex03() throws NoSuchFieldException, IllegalAccessException {
        StringNumbersReader reader = new StringNumbersReader();

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("stringValue", "233412451", "2451251", "안녕안녕", "fail_fail", "245");

        mockingScanner(reader, mockScanner);

        assertThrows(WrongInputRepeatException.class, reader::readNumber);
    }



    private void mockingScanner(StringNumbersReader reader, Scanner mockScanner) throws NoSuchFieldException, IllegalAccessException {
        Field reflectionReader = reader.getClass().getDeclaredField("reader");
        reflectionReader.setAccessible(true);
        reflectionReader.set(reader, mockScanner);
    }
}