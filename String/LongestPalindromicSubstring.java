import java.util.*;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        int n = s.length();
        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if (isPalindrome(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String ans = longestPalindrome(s);

        System.out.println("Longest Palindromic Substring: " + ans);

        sc.close();
    }
}