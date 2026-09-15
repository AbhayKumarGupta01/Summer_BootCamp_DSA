import java.util.*;

class MaximumNumberOfNonOverlappingPalindromicSubstrings {

    public static int maxPalindromes(String s, int k) {

        int count = 0;
        int i = 0;

        while (i <= s.length() - k) {

            boolean found = false;

            for (int j = i + k - 1; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {

                    count++;

                    // Move after the selected palindrome
                    i = j + 1;

                    found = true;
                    break;
                }
            }

            if (!found) {
                i++;
            }
        }

        return count;
    }

    public static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = maxPalindromes(s, k);

        System.out.println("Maximum number of palindromes: " + result);

        sc.close();
    }
}