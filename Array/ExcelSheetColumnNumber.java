import java.util.Scanner;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Excel column title: ");
        String columnTitle = sc.next();

        System.out.println("Column Number: " + titleToNumber(columnTitle));

        sc.close();
    }
}