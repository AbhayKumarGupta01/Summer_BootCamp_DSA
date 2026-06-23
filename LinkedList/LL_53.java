// 53. Remove every kth node

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LL_53 {

    static Node head = null;

    public static Node create_Node(Node head, int data) {
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
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node delete_kth_node(Node head, int k) {

        if (k == 1) {
            return null;
        }
        Node curr = head;
        Node prev = null;
        int count = 1;

        while (curr != null) {
            if (count % k == 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            head = create_Node(head, sc.nextInt());
        }
        System.out.println("Enter value of Kth Node: ");
        int k = sc.nextInt();
        System.out.println("Current LinkedList is: ");
        display(head);
        System.out.println("After Removing every kth Node, Linked List is: ");
        delete_kth_node(head, k);
        display(head);
    }
}
