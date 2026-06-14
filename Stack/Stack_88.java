//  Sort a stack using another stac

import java.util.*;

class Stack_88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> orig = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < n; i++) {
            orig.push(sc.nextInt());
        }

        while (!orig.isEmpty()) {
            int x = orig.pop();

            while (!temp.isEmpty() && temp.peek() > x) {
                orig.push(temp.pop());
            }

            temp.push(x);
        }

        while (!temp.isEmpty()) {
            orig.push(temp.pop());
        }
        System.out.println("Sorted Stack is: ");
        while (!orig.isEmpty()) {
            System.err.print(orig.peek() + " ");
            orig.pop();
        }
    }
}
