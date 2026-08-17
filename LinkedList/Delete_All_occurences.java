import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Delete_All_occurences {

    public static ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode temp = head;

        while (temp != null) {

            if (temp.val == target) {

                // If deleting head
                if (temp == head) {
                    head = temp.next;
                }

                // Connect previous node to next node
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }

                // Connect next node to previous node
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }

            temp = temp.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size as input
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        // Take linked list elements as input
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Take target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Original DLL:");
        printList(head);

        // Delete all occurrences
        head = deleteAllOccurrences(head, target);

        System.out.println("After deleting " + target + ":");
        printList(head);

        sc.close();
    }
}