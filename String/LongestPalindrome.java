import java.util.Scanner;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        int arr[] = new int[128];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int count = 0;
        boolean odd = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count += arr[i];
            } 
            else {
                count += arr[i] - 1;
                odd = true;
            }
        }

        if (odd) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int result = longestPalindrome(s);

        System.out.println(result);

        sc.close();
    }
}