import java.util.Scanner;

public class Longest_unique_substring {

    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (freq[s.charAt(right)] > 0) {
                freq[s.charAt(left)]--;
                left++;
            }

            freq[s.charAt(right)]++;
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Longest_unique_substring obj = new Longest_unique_substring();
        int ans = obj.lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring = " + ans);

        sc.close();
    }
}