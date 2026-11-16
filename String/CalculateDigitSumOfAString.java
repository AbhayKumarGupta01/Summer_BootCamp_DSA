import java.util.*;
class CalculateDigitSumOfAString {
    public static String digitSum (String s, int k){
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i+=k){
                int sum = 0;
                for(int j=i; j<Math.min(i+k, s.length()); j++){
                    sum += s.charAt(j) - '0';
                }
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(digitSum(s, k));
    }
}