import java.util.Scanner;

public class Intersection {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Create linked list
    static ListNode createList(Scanner sc, int n) {

        if (n == 0)
            return null;

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } 
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Find intersection
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {

            if (p1 == null)
                p1 = headB;
            else
                p1 = p1.next;

            if (p2 == null)
                p2 = headA;
            else
                p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List A
        System.out.print("Enter number of nodes in List A: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of List A:");
        ListNode headA = createList(sc, n1);

        // List B
        System.out.print("Enter number of nodes in List B: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of List B:");
        ListNode headB = createList(sc, n2);

        // Intersection position
        System.out.print("Enter intersection position in List A: ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < n1 && headB != null) {

            // Find intersection node in List A
            ListNode intersection = headA;

            for (int i = 0; i < pos; i++) {
                intersection = intersection.next;
            }

            // Go to last node of List B
            ListNode temp = headB;

            while (temp.next != null) {
                temp = temp.next;
            }

            // Connect List B to List A
            temp.next = intersection;
        }

        // Find intersection
        ListNode result = getIntersectionNode(headA, headB);

        // Display result
        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } 
        else {
            System.out.println("No Intersection");
        }

        sc.close();
    }
}