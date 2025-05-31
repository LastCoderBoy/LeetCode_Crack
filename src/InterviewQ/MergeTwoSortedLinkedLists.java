package InterviewQ;

import java.util.ArrayList;

public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1,2,4
        // 1,3,4
        ArrayList<Integer> arr = new ArrayList<>();

        // Pushing the values of the first linked list
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // First linked list: 5 -> 10 -> 15
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(10);
        head1.next.next = new ListNode(15);

        // Second linked list: 2 -> 3 -> 20
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(20);

        ListNode res = mergeTwoLists(head1, head2);
    }
}
