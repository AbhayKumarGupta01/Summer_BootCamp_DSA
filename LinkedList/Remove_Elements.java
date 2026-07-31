import java.util.*;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
    }
}

public class Remove_Elements {

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static Node Remove_elem(Node head, int target) {

        while (head != null && head.data == target) {
            head = head.next;
        }

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data == target) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.print("Enter target element to remove: ");
        int target = sc.nextInt();

        System.out.println("Before Removing:");
        display(head);

        head = Remove_elem(head, target);

        System.out.println("After Removing:");
        display(head);

        sc.close();
    }
}