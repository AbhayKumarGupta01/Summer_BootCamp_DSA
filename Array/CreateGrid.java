import java.util.Scanner;

public class CreateGrid {

    public static String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        // Fill the grid with #
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }

            grid[i] = new String(row);
        }

        // Make the first row free
        char[] firstRow = grid[0].toCharArray();

        for (int j = 0; j < n; j++) {
            firstRow[j] = '.';
        }

        grid[0] = new String(firstRow);

        // Make the last column free
        for (int i = 1; i < m; i++) {
            char[] row = grid[i].toCharArray();
            row[n - 1] = '.';
            grid[i] = new String(row);
        }

        return grid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        String[] grid = createGrid(m, n);

        for (String row : grid) {
            System.out.println(row);
        }

        sc.close();
    }
}