import binaryTrees.Binary_Tree_Inorder_Traversal_94;

import javax.swing.*;
import java.util.*;

public class Test2 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode ptr = result;

            int carry = 0;

            while (l1 != null || l2 != null) {

                int sum = 0 + carry;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10;
                sum = sum % 10;
                ptr.next = new ListNode(sum);
                ptr = ptr.next;
            }

            if (carry == 1) {ptr.next = new ListNode(1);}

            return result.next;
        }

    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create int type variable
        int num = 10;
        System.out.println("The integer value is: " + num);

        // converts int to string type
        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);
    }


}
