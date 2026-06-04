//This Code Reverse each world of string separated by Space
//Example: String = Hello World
//Output String: olleH dlroW


import java.util.*;

class Reverse_of_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }

                System.out.print(" ");
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
