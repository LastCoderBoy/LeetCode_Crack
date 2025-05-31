package InterviewQ;

public class MergeNodesBetweenZeroes {
    public static void main(String[] args) {
        System.out.println(new ListNode(-1));
    }

    private static ListNode mergeNodes(ListNode head) {
        //      0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode finalHead = null;
        ListNode currentNode = head.next;
        ListNode counter = head.next;
        ListNode newCurrent = null;
        int sum = 0;

        while(counter != null){
            if( counter.val != 0){
                sum += counter.val;
            }
            else {
                if (finalHead == null) {
                    finalHead = new ListNode(sum);
                    newCurrent = finalHead;
                } else {
                    newCurrent.next = new ListNode(sum);
                    newCurrent = newCurrent.next;
                }
                sum = 0;
            }
            counter = counter.next;
        }
        return finalHead;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
