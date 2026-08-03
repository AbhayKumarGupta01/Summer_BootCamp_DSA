import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Add2LL {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return dummy.next;
    }
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Add2LL obj = new Add2LL();

        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        System.out.print("First Number : ");
        printList(l1);

        System.out.print("Second Number: ");
        printList(l2);

        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.print("Result       : ");
        printList(result);
    }
}