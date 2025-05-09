package linkedLists;

public class add_Two_Numbers_2 {

    static class ListNode {
        int val;
        add_Two_Numbers_2.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, add_Two_Numbers_2.ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public add_Two_Numbers_2.ListNode addTwoNumbers(add_Two_Numbers_2.ListNode l1, add_Two_Numbers_2.ListNode l2) {

            add_Two_Numbers_2.ListNode result = new add_Two_Numbers_2.ListNode(0);
            add_Two_Numbers_2.ListNode ptr = result;

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
                ptr.next = new add_Two_Numbers_2.ListNode(sum);
                ptr = ptr.next;
            }

            if (carry == 1) {ptr.next = new add_Two_Numbers_2.ListNode(1);}

            return result.next;
        }

    }

    // Helper function to print linked list
    public static void printList(add_Two_Numbers_2.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating l1 = [9,9,9,9,9,9,9]
        add_Two_Numbers_2.ListNode l1 = new add_Two_Numbers_2.ListNode(9);
        l1.next = new add_Two_Numbers_2.ListNode(9);
        l1.next.next = new add_Two_Numbers_2.ListNode(9);
        l1.next.next.next = new add_Two_Numbers_2.ListNode(9);
        l1.next.next.next.next = new add_Two_Numbers_2.ListNode(9);
        l1.next.next.next.next.next = new add_Two_Numbers_2.ListNode(9);
        l1.next.next.next.next.next.next = new add_Two_Numbers_2.ListNode(9);

        // Creating l2 = [9,9,9,9]
        add_Two_Numbers_2.ListNode l2 = new add_Two_Numbers_2.ListNode(9);
        l2.next = new add_Two_Numbers_2.ListNode(9);
        l2.next.next = new add_Two_Numbers_2.ListNode(9);
        l2.next.next.next = new add_Two_Numbers_2.ListNode(9);

        // Call the function
        add_Two_Numbers_2.Solution sol = new add_Two_Numbers_2.Solution();
        add_Two_Numbers_2.ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result
        printList(result);
    }
}
