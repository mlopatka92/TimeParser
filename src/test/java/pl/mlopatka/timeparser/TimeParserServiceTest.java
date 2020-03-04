package pl.mlopatka.timeparser;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeParserServiceTest {

    private static TimeParserService timeParserService;

    @BeforeAll
    public static void setUp() {
        timeParserService = new TimeParserServiceImpl();
    }

    @ParameterizedTest
    @MethodSource("prepareParametrizedData")
    public void shouldReturnPrettyString(long inputMils, String expectedResult) {
        //when
        String actualPrettyString = timeParserService.toPrettyString(inputMils);

        //than
        assertEquals(expectedResult, actualPrettyString);
    }

    private static Stream<Arguments> prepareParametrizedData() {
        return Stream.of(
                Arguments.of(100, "1 min 40 sec "),
                Arguments.of(50, "50 sec "));

    }
}