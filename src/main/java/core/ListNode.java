package core;

public class ListNode {

    @SuppressWarnings("checkstyle:VisibilityModifier")
    public int val;

    @SuppressWarnings("checkstyle:VisibilityModifier")
    public ListNode next;

    public ListNode() {
    }

    @SuppressWarnings("checkstyle:HiddenField")
    public ListNode(int val) {
        this.val = val;
    }

    @SuppressWarnings("checkstyle:HiddenField")
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
