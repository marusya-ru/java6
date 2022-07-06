package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrRange.csv")
    public void testSqrCount(int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();

        int actual = service.sqrCount(minRange, maxRange);

        Assertions.assertEquals(expected, actual);
    }
}
