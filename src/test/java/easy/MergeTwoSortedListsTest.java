package easy;

import core.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    @Test
    void testCaseExampleOne() {
        // Given
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // When
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        // Then
        assertThat(result.val).isEqualTo(1);

        result = result.next;
        assertThat(result.val).isEqualTo(1);

        result = result.next;
        assertThat(result.val).isEqualTo(2);

        result = result.next;
        assertThat(result.val).isEqualTo(3);

        result = result.next;
        assertThat(result.val).isEqualTo(4);

        result = result.next;
        assertThat(result.val).isEqualTo(4);
    }

    @Test
    void testCaseExampleTwo() {
        // Given
        ListNode list1 = null;
        ListNode list2 = null;

        // When
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        // Then
        assertThat(result).isNull();
    }

    @Test
    void testCaseExampleThree() {
        // Given
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        // When
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        // Then
        assertThat(result.val).isEqualTo(0);
    }

    @Test
    void testCaseExampleFour() {
        // Given
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(1);

        // When
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        // Then
        assertThat(result.val).isEqualTo(1);

        result = result.next;
        assertThat(result.val).isEqualTo(2);
    }

}