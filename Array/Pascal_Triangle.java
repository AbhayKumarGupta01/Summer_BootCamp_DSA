// Print all rows element of a Pascal's Triangle

import java.util.*;

class Pascal_Triangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }

        return ans;
    }

    public List<Integer> generateRow(int row) {
        long value = 1;
        List<Integer> ansRow = new ArrayList<>();

        ansRow.add(1);

        for (int i = 1; i < row; i++) {
            value = value * (row - i);
            value = value / i;
            ansRow.add((int) value);
        }

        return ansRow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        Pascal_Triangle obj = new Pascal_Triangle();

        List<List<Integer>> result = obj.generate(numRows);

        System.out.println("\nPascal's Triangle:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
