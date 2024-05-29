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

}