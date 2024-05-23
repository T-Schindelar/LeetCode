package easy;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.<br>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.<br>
 * You can return the answer in any order.<br>
 * <br>
 * Example 1:<br>
 * Input: nums = [2,7,11,15], target = 9<br>
 * Output: [0,1]<br>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<br>
 * <br>
 * Example 2:<br>
 * Input: nums = [3,2,4], target = 6<br>
 * Output: [1,2]<br>
 * <br>
 * Example 3:<br>
 * Input: nums = [3,3], target = 6<br>
 * Output: [0,1]<br>
 * <br>
 * Constraints:<br>
 * 2 <= nums.length <= 10⁴<br>
 * -10⁹ <= nums[i] <= 10⁹<br>
 * -10⁹ <= target <= 10⁹<br>
 * Only one valid answer exists.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }

            }
        }
        return null;
    }
}