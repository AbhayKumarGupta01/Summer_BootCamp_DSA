import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
class UpdatePrice_LL{
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
    static void update(int pos, int price){
        Node curr = head;
        int cnt = 0;
        while(curr != null){
            if(cnt == pos){
                curr.data = price;
                break;
            }
            curr = curr.next;
            cnt++;
        }
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
        int pos = sc.nextInt();
        int price = sc.nextInt();
        update(pos, price);
        display();
    }

}
