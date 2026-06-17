// 37. Minimum Window Substring

import java.util.*;

class String_37 {

    public static String min_window_Len(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        char arr[] = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int start = 0;
        int count = t.length();
        int freq[] = new int[128];
        if (s.length() < t.length()) {
            return "";
        }
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (freq[ch] > 0) {
                count--;
            }
            freq[ch]--;

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(min_window_Len(s, t));
    }
}
