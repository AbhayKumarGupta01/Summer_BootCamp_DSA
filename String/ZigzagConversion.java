
import java.util.Scanner;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {

            rows[currentRow].append(s.charAt(i));

            if (currentRow == 0) {
                direction = 1;
            } 
            else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        String result = convert(s, numRows);

        System.out.println("Zigzag Converted String: " + result);

        sc.close();
    }
}
