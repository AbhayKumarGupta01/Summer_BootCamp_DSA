import java.util.*;
class Negative_of_even_rows_and_swap_those_rows_in_a_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    arr[i][j] = -arr[i][j];
                }
            }
            
        }
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = temp;
            }
        }

            System.out.println("Result Matrix: ");
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
} 