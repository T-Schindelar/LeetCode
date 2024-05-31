package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * <br><br>
 * If there is no common prefix, return an empty string "".
 * <br><br>
 * Example 1: Input: strs = ["flower","flow","flight"] Output: "fl"
 * <br><br>
 * Example 2: Input: strs = ["dog","racecar","car"] Output: ""
 * <br><br>
 * Explanation: There is no common prefix among the input strings.
 * <br><br>
 * Constraints: 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i]
 * consists of only lowercase English letters.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.isEmpty()) {
                return prefix;
            }
            String str = strs[i];
            // swap if shorter
            if (str.length() < prefix.length()) {
                String tmp = prefix;
                prefix = str;
                str = tmp;
            }
            for (int j = 0; j < prefix.length(); j++) {
                if (prefix.charAt(j) != str.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
}
