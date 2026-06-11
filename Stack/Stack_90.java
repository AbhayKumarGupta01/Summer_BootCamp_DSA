// Reverse a string using stack
import java.util.*;
class Stack_90{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            stk.push(ch);
        }
        while(!stk.isEmpty()){
            System.out.print(stk.peek());
            stk.pop();
        }
    }
}