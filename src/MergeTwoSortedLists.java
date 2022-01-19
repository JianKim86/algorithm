public class MergeTwoSortedLists {
    public void run() {
        //You are given the heads of two sorted linked lists list1 and list2.
        //Merge the two lists in a one sorted list.
        // The list should be made by splicing together the nodes of the first two lists.
        //Return the head of the merged linked list.

        solution(new ListNode(1, new ListNode(2, null)),
                new ListNode(1, new ListNode(3, null)));
    }

    private ListNode solution(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = solution(list1.next, list2);
            return list1;
        } else {
            list2.next = solution(list1, list2.next);
            return list2;
        }
    }


}
