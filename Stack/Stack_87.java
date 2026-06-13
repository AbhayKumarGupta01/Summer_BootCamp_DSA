// Delete middle element of stack

import java.util.*;

class Stack_87 {

    public static void deleteMid(Stack<Integer> s) {
        int mid = s.size() / 2;
        solve(s, mid);
    }

    private static void solve(Stack<Integer> s, int mid) {
        if (mid == 0) {
            s.pop();
            return;
        }

        int x = s.pop();
        solve(s, mid - 1);
        s.push(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        deleteMid(s);

        System.out.println(s);

        sc.close();
    }
}