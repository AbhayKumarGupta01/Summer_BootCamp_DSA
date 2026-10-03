import java.util.*;
class LongestValidParentheses{
  public static int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(i);
            }
            else{
                stk.pop();
            }
            if(stk.isEmpty()){
                stk.push(i);
            }
            else{
                int length = i-stk.peek();
                count = Math.max(count, length);
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestValidParentheses(s));
    }
}