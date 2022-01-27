package util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 출력용
    @Override
    public String toString() {
        if (this.next == null) {
            return Integer.toString(this.val);
        } else {
            return this.val + "," + next.toString();
        }
    }
}
