package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    @Test
    void testCaseExampleOne() {
        // Given
        String input = "III";

        // When
        int result = RomanToInteger.romanToInt(input);

        // Then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        String input = "LVIII";

        // When
        int result = RomanToInteger.romanToInt(input);

        // Then
        assertThat(result).isEqualTo(58);
    }

    @Test
    void testCaseExampleThree() {
        // Given
        String input = "MCMXCIV";

        // When
        int result = RomanToInteger.romanToInt(input);

        // Then
        assertThat(result).isEqualTo(1994);
    }

    @Test
    void testCaseExampleFour() {
        // Given
        String input = "IV";

        // When
        int result = RomanToInteger.romanToInt(input);

        // Then
        assertThat(result).isEqualTo(4);
    }
}