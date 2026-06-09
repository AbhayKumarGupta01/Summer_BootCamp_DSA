
import java.util.Scanner;

class Array_21 {

    static int[][] Rotate_180(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row / 2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[row - i - 1];
            mat[row - i - 1] = temp;
        }
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = row - 1;
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
        int result[][] = Rotate_180(mat);
        System.out.println("Rotated 180 Degree Matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
