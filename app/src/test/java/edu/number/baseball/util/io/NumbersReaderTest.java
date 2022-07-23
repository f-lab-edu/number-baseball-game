package edu.number.baseball.util.io;

import edu.number.baseball.domain.InputNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumbersReaderTest {

    @Test
    @DisplayName("NumberReader : 문자열 입력시 - 정상 케이스")
    void stringReader() {
        StringNumbersReader reader = new StringNumbersReader();

        // Issue : Scanner 는 Final Class
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("245");

        InputNumbers inputNumbers = reader.readNumber();
        List<Integer> numbers = inputNumbers.getNumbers();


        assertEquals(numbers.size(), 3);
        assertAll(
                () -> assertEquals(numbers.get(0), 2),
                () -> assertEquals(numbers.get(1), 4),
                () -> assertEquals(numbers.get(2), 5)
        );
    }
}