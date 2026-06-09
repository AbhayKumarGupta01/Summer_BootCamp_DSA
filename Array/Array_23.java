// Max Product SubArray
import java.util.*;
class Array_23{
    static int Max_Product(int arr[]){
        int product=1;
        int start =0;
        int end=0;
        int maxProduct=1;
        for(int i=0; i<arr.length; i++){
            start =i;
            product *= arr[i]; 
            maxProduct = Math.max(maxProduct, product);
            if(product<0){
                end=i;
                product=1;

            }

        }
        return maxProduct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = Max_Product(arr);
        System.out.println("Maximum product is: " +result);
    }
}