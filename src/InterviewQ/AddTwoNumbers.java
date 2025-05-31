package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class AddTwoNumbers {
    public static ListNodeForAdd addTwoNumbers(ListNodeForAdd l1, ListNodeForAdd l2) {
        ListNodeForAdd dummy = new ListNodeForAdd();
        ListNodeForAdd res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNodeForAdd(num);
            dummy = dummy.next;
        }

        return res.next;
    }

    public static void main(String[] args) {

    }

}

