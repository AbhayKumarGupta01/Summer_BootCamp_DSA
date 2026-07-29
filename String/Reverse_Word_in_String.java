import java.util.*;
public class Reverse_Word_in_String{
    static String ReverseWords(String s){
        String []words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);

            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        ReverseWords(s);
        System.out.println("Reversed String: " + ReverseWords(s));

        sc.close();
    }
}