import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class CreateLL{
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
    static void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        display();
    }
}
