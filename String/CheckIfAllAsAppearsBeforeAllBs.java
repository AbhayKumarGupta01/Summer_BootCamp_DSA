import java.util.*;
public class CheckIfAllAsAppearsBeforeAllBs {
    public static boolean checkString(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b' && index == -1) {
                index = i;
            }
        }
        if (index == -1) {
            return true;
        }
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkString(s));
        sc.close();
    }
}
