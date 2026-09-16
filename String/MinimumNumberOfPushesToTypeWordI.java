import java.util.*;

public class MinimumNumberOfPushesToTypeWordI {

    public static int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (i / 8) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        int result = minimumPushes(word);

        System.out.println("Minimum number of pushes: " + result);

        sc.close();
    }
}