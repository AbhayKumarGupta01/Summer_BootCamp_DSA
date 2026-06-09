// Spiral traversal of matrix

import java.util.*;

class Array_19 {

    static void Spiral_mat(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int top = 0;
        int right = n - 1, bottom = m - 1;
        // int ans[] = new int[n];
        while(top <= bottom && left <= right){
        for (int i = left; i <= right; i++) {
            System.out.println(mat[top][i]);
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            System.out.println(mat[i][right]);
        }
        right--;
        if (top <= bottom) {
            for (int j = right; j >= left; j--) {
                System.out.println(mat[bottom][j] + " ");
            }
            bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                System.out.println(mat[i][left] + " ");
            }
            left++;
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int mat[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Spiral_mat(mat);
    }
}
