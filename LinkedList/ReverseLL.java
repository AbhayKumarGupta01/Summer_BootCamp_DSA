import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;

    Node(int val){
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
class ReverseLL{
    static Node head = null;
    // Insetion of elements
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
    newnode.prev = temp;
    }

    // Reverse
    static void reverse(){
        Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    
    while(temp != null){
        System.out.print(temp.data + " -> ");
    temp = temp.prev;
    }
    System.out.print("null");
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        reverse();
    }
    
}
