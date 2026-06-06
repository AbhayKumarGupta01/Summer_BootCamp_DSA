
import java.util.Scanner;

class Count_Vowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char vowel[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;
        for (char ch : s.toCharArray()) {
            for (char v : vowel) {
                if (ch == v) {

                    count++;

                }

            }
        }
        System.out.println(count);
    }
}
