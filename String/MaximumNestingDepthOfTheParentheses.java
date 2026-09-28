import java.util.*;
class MaximumNestingDepthOfTheParentheses {
    public static int MaximumNestingDepthOfParentheses(String s){
        int depth =0;
        int max =0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                depth++;
                max = Math.max(max, depth);
            }
            else if(ch == ')'){
                depth--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = MaximumNestingDepthOfParentheses(s);
        System.out.println(result);
    }
}