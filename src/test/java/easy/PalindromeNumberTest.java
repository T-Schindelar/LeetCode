package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    @Test
    void testCaseExampleOne() {
        // Given
        int input = 121;

        // When
        boolean result = PalindromeNumber.isPalindrome(input);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        int input = -121;

        // When
        boolean result = PalindromeNumber.isPalindrome(input);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    void testCaseExampleThree() {
        // Given
        int input = 10;

        // When
        boolean result = PalindromeNumber.isPalindrome(input);

        // Then
        assertThat(result).isFalse();
    }
}