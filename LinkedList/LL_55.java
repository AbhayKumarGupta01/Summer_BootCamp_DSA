// 55. Update value at index in DLL

import java.util.*;

class Node {

    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class LL_55 {

    static Node update(Node head, int index, int value) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        // If index is valid
        if (temp != null) {
            temp.data = value;
        }

        return head;
    }

    static Node createDLL(int n, Scanner sc) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        return head;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating DLL: 10 <-> 20 <-> 30 <-> 40
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        Node head = createDLL(n, sc);

        System.out.println("Before Update:");
        display(head);

        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        head = update(head, index, value);

        System.out.println("After Update:");
        display(head);
    }
}
