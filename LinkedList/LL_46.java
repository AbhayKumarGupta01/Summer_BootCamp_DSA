// Delete at Specific Position

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL_46 {

    Node head = null;

    void CreateLL(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void DeleteNode(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Nodes in LinkedList: ");
        int n = sc.nextInt();
        LL_46 obj = new LL_46();
        System.out.println("Enter Nodes: ");
        for (int i = 0; i < n; i++) {
            obj.CreateLL(sc.nextInt());
        }
        System.out.println("Enter Position: ");
        int pos = sc.nextInt();
        obj.DeleteNode(pos);
        System.out.println("After Deletion LinkedList: ");
        obj.printLL();
    }

}
