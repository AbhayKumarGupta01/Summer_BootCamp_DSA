// Longest Substring Without Repeating Characters

import java.util.*;

class String_36 {

    public static void Longest_unique_substring(String s) {
        int freq[] = new int[256];

        int left = 0;
        int maxLen = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        String longestSubstring = s.substring(start, start + maxLen);

        System.out.println("Max Length of Non-Repeating Characters: " + maxLen);
        System.out.println("Max Substring of Non-Repeating Characters: " + longestSubstring);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Longest_unique_substring(s);
    }
}
