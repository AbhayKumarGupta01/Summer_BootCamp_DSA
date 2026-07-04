import java.util.*;

public class Merge_2_Lists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    // Create linked list from user input
    public static ListNode createList(Scanner sc, int n) {

        if (n == 0)
            return null;

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in first sorted list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of first sorted list:");
        ListNode list1 = createList(sc, n1);

        System.out.print("Enter number of nodes in second sorted list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of second sorted list:");
        ListNode list2 = createList(sc, n2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("\nMerged Sorted List:");
        printList(merged);

        sc.close();
    }
}