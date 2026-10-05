
import java.util.*;

public class ScoreOfParentheses {

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

       for(char ch :  s.toCharArray()){
        if(ch == '('){
            stk.push(0);
        }
        else{
            int v = stk.pop();
            int score = Math.max(2*v, 1);
            
            int top = stk.pop();
            stk.push(top+score);
        }
       }

        return stk.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        System.out.println("Score: " + scoreOfParentheses(s));

        sc.close();
    }
}
