import java.util.*;
class ReverseDegreeofString {
    static int index = 1;
    static int product = 1;
    static int sum = 0;
    static int rev = 0;
    public static int reverseDegree(String s) {
        for(char ch : s.toCharArray()){
            rev = 26 - (ch-'a');
            product = rev *index;
            sum += product;
            index++;
        }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseDegree(s));
    }
}