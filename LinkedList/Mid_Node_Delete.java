// Delete Middle Node of a Linked List
import java.util.*;
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Mid_Node_Delete{
    static public Node delete_mid(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
        static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LinkedList<Integer> list = new LinkedList<>();
        Node head = null;
        Node tail = null;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int val =sc.nextInt();
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        head = delete_mid(head);
        printList(head);
        
    }
}