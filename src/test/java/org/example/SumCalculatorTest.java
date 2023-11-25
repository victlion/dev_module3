package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @DisplayName("Test Method from 1>")
    @ParameterizedTest()
    @CsvSource(value = {"1,1", "3,6"})
    void sumTesterWhereNumbersFromOneToNine(int value, int expected) {
        int actualSum = sumCalculator.sum(value);
        Assertions.assertEquals(expected, actualSum);
    }

    @DisplayName("Test Method from 0")
    @Test
    void sumTesterExceptionWhereNumberZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
