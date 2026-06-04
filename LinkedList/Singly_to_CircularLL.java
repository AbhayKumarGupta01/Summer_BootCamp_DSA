import java.util.*;
class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
class Singly_to_CircularLL{
    static Node head = null;
    static void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
           temp = temp.next; 
        }
        temp.next = newnode;
    }
    static void convert_to_CLL(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
    }

   static void deleteAtPosition(int pos) {

    if(head == null) {
        System.out.println("List is empty");
        return;
    }

    // Delete head node
    if(pos == 0) {

        // Single node case
        if(head.next == head) {
            head = null;
            return;
        }

        Node last = head;

        while(last.next != head) {
            last = last.next;
        }

        last.next = head.next;
        head = head.next;
        return;
    }

    Node curr = head;
    Node prev = null;
    int count = 0;

    while(count < pos && curr.next != head) {
        prev = curr;
        curr = curr.next;
        count++;
    }

    if(count != pos) {
        System.out.println("Invalid Position");
        return;
    }

    prev.next = curr.next;
}


    static void display(){
        if(head == null)
        return;

    Node temp = head;

    do {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    } while(temp != head);

    System.out.println("(head)");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        convert_to_CLL();
        display();
         int pos = sc.nextInt();

    deleteAtPosition(pos);

    display();
    }
}
