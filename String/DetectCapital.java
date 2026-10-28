import java.util.Scanner;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        if (word.equals(word.toLowerCase())) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        System.out.println(detectCapitalUse(word));

        sc.close();
    }
}