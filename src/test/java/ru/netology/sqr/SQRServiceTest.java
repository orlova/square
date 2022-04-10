package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"limit values, 100, 9801, 90",
            "inside limit values, 101, 9800, 88",
            "outside limit values, 99, 9802, 90",
            "positive values, 200, 300, 3",
            "negative values, 200, 202, 0"})

    void ShouldSquareCalculate(String testName, int min, int max, int expected) {

        SQRService service = new SQRService();

        int actual = service.square(min,max);

        assertEquals (expected, actual);
    }
}