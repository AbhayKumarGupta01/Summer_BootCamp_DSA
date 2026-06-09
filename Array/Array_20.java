// Matrix diagonal difference 
import java.util.*;
class Array_20{
    static int Diagonal_Sum_Difference(int mat[][]){
        int n = mat.length;
        int primary =0;
        int secondary =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    primary += mat[i][j];
                }
                if(i+j == n-1){
                    secondary += mat[i][j];
                }
            }
        }
        return Math.abs(primary - secondary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int result = Diagonal_Sum_Difference(mat);
        System.out.println(result);
    }
}