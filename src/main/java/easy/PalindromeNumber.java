package easy;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <br><br>
 * Example 1: Input: x = 121 Output: true Explanation: 121 reads as 121 from
 * left to right and from right to left.
 * <br><br>
 * Example 2: Input: x = -121 Output: false Explanation: From left to right, it
 * reads -121. From right to left, it becomes 121-. Therefore it is not a
 * palindrome.
 * <br><br>
 * Example 3: Input: x = 10 Output: false Explanation: Reads 01 from right to
 * left. Therefore it is not a palindrome.
 * <br><br>
 * Constraints: -2³¹ <= x <= 2³¹ - 1
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] xChars = Integer.toString(x).toCharArray();
        int haelfte = xChars.length / 2;

        for (int i = 0; i < haelfte; i++) {
            if (xChars[i] != xChars[xChars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
