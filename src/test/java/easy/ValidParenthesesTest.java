package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    void testCaseExampleOne() {
        // Given
        String input = "()";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        String input = "()[]{}";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void testCaseExampleThree() {
        // Given
        String input = "(]";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    void testCaseExampleFour() {
        // Given
        String input = "))";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    void testCaseExampleFive() {
        // Given
        String input = "()";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void testCaseExampleSix() {
        // Given
        String input = "()))";

        // When
        boolean result = ValidParentheses.isValid(input);

        // Then
        assertThat(result).isFalse();
    }
}