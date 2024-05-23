package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void testCaseExampleOne() {
        // Given
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // When
        int[] result = TwoSum.twoSum(nums, target);

        // Then
        assertThat(result).isEqualTo(new int[]{0, 1});
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        int[] nums = {3, 2, 4};
        int target = 6;

        // When
        int[] result = TwoSum.twoSum(nums, target);

        // Then
        assertThat(result).isEqualTo(new int[]{1, 2});
    }

    @Test
    void testCaseExampleThree() {
        // Given
        int[] nums = {3, 3};
        int target = 6;

        // When
        int[] result = TwoSum.twoSum(nums, target);

        // Then
        assertThat(result).isEqualTo(new int[]{0, 1});
    }

}