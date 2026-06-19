// 47. Detect cycle in a linkedlist

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LL_47 {

    static Node head = null;

    static void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;

    }

    static void createCycle(int pos) {
        if (pos == -1) {
            return;
        }

        Node temp = head;
        Node cycleNode = null;
        Node tail = null;

        int index = 0;

        while (temp != null) {
            if (index == pos) {
                cycleNode = temp;
            }

            tail = temp;
            temp = temp.next;
            index++;
        }

        if (tail != null) {
            tail.next = cycleNode;
        }
    }

    static boolean detect_cycle(Node head) {
        Node slow = head;
        Node fast = head;
        // bool isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        int pos = sc.nextInt();
        createCycle(pos);
        System.out.println(detect_cycle(head));
    }
}
