import java.util.*;

public class MinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode temp = head.next;

        int temp_idx = 1;

        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (temp != null && temp.next != null) {

            if ((temp.val > prev.val && temp.val > temp.next.val) ||
                (temp.val < prev.val && temp.val < temp.next.val)) {

                if (first == -1) {
                    first = temp_idx;
                } else {
                    minDistance = Math.min(minDistance, temp_idx - last);
                }

                last = temp_idx;
            }

            prev = temp;
            temp = temp.next;
            temp_idx++;
        }

        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }

        int maxDistance = last - first;

        return new int[]{minDistance, maxDistance};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Linked list must contain at least 2 nodes.");
            return;
        }

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter " + n + " node values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int[] result = nodesBetweenCriticalPoints(head);

        System.out.println("Minimum distance: " + result[0]);
        System.out.println("Maximum distance: " + result[1]);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}