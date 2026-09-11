import java.util.*;

public class Unique3DigitEvenNumbers {

    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < digits.length; j++) {
                if (j == i) continue;

                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;

                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    set.add(num);
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        Unique3DigitEvenNumbers obj = new Unique3DigitEvenNumbers();

        int[] digits = {1, 2, 3, 4};

        System.out.println(obj.totalNumbers(digits));
    }
}