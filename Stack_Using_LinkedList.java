import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Stack_Using_LinkedList{
    Node top;
    void push(int data){
        Node newnode = new Node(data);
        
            newnode.next = top;
            top = newnode;
    }
    int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int val = top.data;
            top = top.next;
            return val;
        }
    }
    int peek(){
        if(top==null){
            return -1;
        }
        return top.data;
    }
    void Display(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Stack_Using_LinkedList stack = new Stack_Using_LinkedList();
        Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        int n = sc.nextInt();
            for(int i=0; i<n; i++){
                stack.push(sc.nextInt());
            }
            System.out.print("Stack: ");
            stack.Display();
            System.out.println("Popped Element: " + stack.pop());
            System.out.println("Top ELement: " + stack.peek());
            System.out.print("After Pop: ");
            stack.Display();
    }
}