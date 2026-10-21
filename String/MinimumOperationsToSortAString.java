import java.util.*;
class MinimumOperationsToSortAString {
    public static int sort(String s){
        int n = s.length();
        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        char min = 'z' , max = 'a';
        for(char ch : s.toCharArray()){
            min = (char)Math.min(min, ch);
            max = (char)Math.max(max, ch);
        }
        if(s.charAt(0) == min || s.charAt(n-1) == max){
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sort(s));
    }
}