// 14. Insert row and column in a matrix

import java.util.*;

class Array_14 {

    static int[][] Row_And_Col_Add(int arr[][], int r, int c, int newRow[], int newCol[]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int new_Arr[][] = new int[rows + 1][cols + 1];

        for (int i = 0, ni = 0; i < rows; i++, ni++) {
            if (ni == r) {
                ni++;
            }
            for (int j = 0, nj = 0; j < cols; j++, nj++) {
                if (nj == c) {
                    nj++;
                }

                new_Arr[ni][nj] = arr[i][j];
            }
        }
        for (int i = 0; i < cols + 1; i++) {
            new_Arr[r][i] = newRow[i];
        }
        for (int i = 0; i < rows + 1; i++) {
            new_Arr[i][c] = newCol[i];
        }
        return new_Arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter No. of Columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter New Row No. where you want to insert new row: ");
        int row_no = sc.nextInt();
        System.out.println("Enter New Column No. where you want to insert new column: ");
        int col_no = sc.nextInt();
        System.out.println("Enter New Row Elements: ");
        int newRow[] = new int[cols + 1];
        for (int i = 0; i < newRow.length; i++) {
            newRow[i] = sc.nextInt();
        }
        System.out.println("Enter New Columns Elements: ");
        int newCol[] = new int[rows + 1];
        for (int i = 0; i < newCol.length; i++) {
            newCol[i] = sc.nextInt();
        }
        int result[][] = Row_And_Col_Add(arr, row_no, col_no, newRow, newCol);

        System.out.println("Result:");

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
