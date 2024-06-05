package easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * '] ', determine if the input string is valid.
 * <br><br>
 * An input string is valid if:
 * <li>Open brackets must be closed by the same type of brackets.</li>
 * <li>Open brackets must be closed in the correct order.</li>
 * <li>Every close bracket has a corresponding open bracket of the same
 * type.</li>
 * <br><br>
 * Example 1: Input: s = "()" Output: true
 * <br><br>
 * Example 2: Input: s = "()[]{}" Output: true
 * <br><br>
 * Example 3: Input: s = "(]" Output: false
 * <br><br>
 * Constraints: 1 <= s.length <= 10⁴ s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> parentheses = new Stack<>();
        for (char c : s.toCharArray()) {
            if (parentheses.isEmpty()) {
                parentheses.push(c);
                continue;
            }
            switch (c) {
                case ')':
                    if (parentheses.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (parentheses.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (parentheses.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    parentheses.push(c);
            }
        }
        return parentheses.isEmpty();
    }
}
