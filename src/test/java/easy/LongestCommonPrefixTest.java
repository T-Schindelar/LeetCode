package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    @Test
    void testCaseExampleOne() {
        // Given
        String[] input = {"flower", "flow", "flight"};

        // When
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        // Then
        assertThat(result).isEqualTo("fl");
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        String[] input = {"dog", "racecar", "car"};

        // When
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        // Then
        assertThat(result).isBlank();
    }

    @Test
    void testCaseExampleThree() {
        // Given
        String[] input = {"aa", "a"};

        // When
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        // Then
        assertThat(result).isEqualTo("a");
    }

    @Test
    void testCaseExampleFour() {
        // Given
        String[] input = {"", "b"};

        // When
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        // Then
        assertThat(result).isBlank();
    }

    @Test
    void testCaseExampleFive() {
        // Given
        String[] input = {"reflower", "flow", "flight"};

        // When
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        // Then
        assertThat(result).isBlank();
    }

}