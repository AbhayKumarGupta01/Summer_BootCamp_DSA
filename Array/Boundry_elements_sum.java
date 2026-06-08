import java.util.*;
class Boundry_elements_sum{
    int b_sum(int arr[][]){
        int n = arr.length;
        int sum=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    sum += arr[i][j];
            }
        }
        
    }
    return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Boundry_elements_sum obj = new Boundry_elements_sum();
        
        System.out.println("Sum of Boundry Elements is: " +obj.b_sum(arr));
    }
}
