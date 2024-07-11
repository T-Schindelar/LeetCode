

package easy;

import core.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2. Merge the
 * two lists into one sorted list. The list should be made by splicing together
 * the nodes of the first two lists. Return the head of the merged linked list.
 * Example 1: Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
 * Example 2: Input: list1 = [], list2 = [] Output: [] Example 3: Input: list1 =
 * [], list2 = [0] Output: [0] Constraints: The number of nodes in both lists is
 * in the range [0, 50]. -100 <= Node.val <= 100 Both list1 and list2 are sorted
 * in non-decreasing order.
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list2 == null) {
            return new ListNode(list1.val);
        } else if (list1 == null) {
            return new ListNode(list2.val);
        }

        return new ListNode(Math.min(list1.val, list2.val),
                new ListNode(Math.max(list1.val, list2.val),
                        mergeTwoLists(list1.next, list2.next)));
    }

}

