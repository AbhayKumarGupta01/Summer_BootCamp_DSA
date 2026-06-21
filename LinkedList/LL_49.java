// 49. Merge two sorted linkedlist

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LL_49 {

    static Node head1 = null;
    static Node head2 = null;

    static Node create_Node(Node head, int data) {
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

    static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }
        if (temp1 != null) {
            current.next = temp1;
        }
        if (temp2 != null) {
            current.next = temp2;
        }
        return dummy.next;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            head1 = create_Node(head1, sc.nextInt());
        }
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            head2 = create_Node(head2, sc.nextInt());
        }

        System.out.print("List 1: ");
        display(head1);

        System.out.print("List 2: ");
        display(head2);

        Node mergedHead = merge(head1, head2);
        System.out.println("Merged Sorted LinkedList is: ");
        display(mergedHead);

    }
}
