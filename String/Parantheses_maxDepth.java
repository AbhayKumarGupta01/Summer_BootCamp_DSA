import java.util.*;
class Parantheses_maxDepth{
    public static int maxDepth(String s){
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                stk.pop();
            }
            ans = Math.max(ans, stk.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Max Depth of string " + s + " is: " +maxDepth(s));
    }
}