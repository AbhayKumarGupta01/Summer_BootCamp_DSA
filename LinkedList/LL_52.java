//  52. Remove duplicates from Sorted Linkedlist

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LL_52 {

    static Node head = null;

    static Node createNode(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static Node remove_duplicate(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            head = createNode(head, sc.nextInt());
        }
        System.out.println("Linked List is: ");
        display(head);
        remove_duplicate(head);
        System.out.println("Linked List after removing duplicates: ");
        display(head);

    }
}
