
import java.util.Scanner;

class Stack_Using_Array {

    int top;
    int[] arr;
    int capacity;

    Stack_Using_Array(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
        } else {
            arr[++top] = val;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    int peek() {
        if (top == -1) {
            return -1;
        } else {
            return arr[top];
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("-1");
            //return;
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack_Using_Array stack = new Stack_Using_Array(size);
        //Stack(size);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Stack Elements: ");
        stack.display();
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element:" + stack.pop());
        System.out.println("After Pop");
        stack.display();
    }
}
