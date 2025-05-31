package InterviewQ;

public class LinkedListCycle {
    public static void main(String[] args) {
        System.out.println(hasCycle(new ListNode(-1)));
    }
    public static boolean hasCycle(ListNode head) {
        // Handle edge cases
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers
        ListNode slow = head;    // Tortoise - moves one step
        ListNode fast = head;    // Hare - moves two steps

        // Continue until fast reaches end or finds cycle
        while (fast != null && fast.next != null) {
            // Move slow pointer one step
            slow = slow.next;

            // Move fast pointer two steps
            fast = fast.next.next;

            // If they meet, we found a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If we exit the loop, no cycle was found
        return false;
    }
}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int val) { this.val = val;}
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
