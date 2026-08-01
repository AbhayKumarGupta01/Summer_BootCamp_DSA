
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class PalindromeLL {

    static Node head = null;

    static void createNode(int data) {
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

    static boolean PalindromicLL(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node first = head;
        Node second = prev;
        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    void display(Node head) {
        while (head != null) {
            System.out.println(head.data + "-> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            createNode(sc.nextInt());
        }
        System.out.println("The given LL is Palindrome: " + PalindromicLL(head));
    }
}
