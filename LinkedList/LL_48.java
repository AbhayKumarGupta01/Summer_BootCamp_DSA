
import java.util.Scanner;

// 48. Intersection point
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LL_48 {

    static Node createNode(int data, Node head) {
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

    static Node Intersection(Node headA, Node headB) {
        Node ptrA = headA;
        Node ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ListA
        int n1 = sc.nextInt();
        Node headA = null;
        for (int i = 0; i < n1; i++) {
            headA = createNode(sc.nextInt(), headA);
        }
        // ListB
        int n2 = sc.nextInt();
        Node headB = null;
        for (int i = 0; i < n1; i++) {
            headB = createNode(sc.nextInt(), headB);
        }
        int pos = sc.nextInt();

        if (pos != -1) {
            Node intersectNode = headA;

            for (int i = 0; i < pos; i++) {
                intersectNode = intersectNode.next;
            }

            Node temp = headB;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = intersectNode;
        }

        Node ans = Intersection(headA, headB);

        if (ans != null) {
            System.out.println("Intersection point = " + ans.data);
        } else {
            System.out.println("No intersection");
        }

    }
}
