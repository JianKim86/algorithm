package week3;

import util.ListNode;

public class RemoveDuplicatesFromSortedList {
    public void run() {
        //Given the head of a sorted linked list,
        //delete all duplicates such that each element appears only once. Return the linked list sorted as well.

        System.out.println(solution(new ListNode(1, new ListNode(1, new ListNode(2, null)))));
    }

    private ListNode solution(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next = solution(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
