//  Rotate matrix by 90° 

import java.util.*;

class Array_18 {

    static int[][] rotate(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        //Transpose
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Rotate
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = col - 1;

            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotated matrix by 90 Degree is: ");
        int result[][] = rotate(mat);
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
