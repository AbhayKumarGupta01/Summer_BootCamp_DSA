import java.util.*;
class GCD_of_array{
    public static int gcd_array(int []nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(min , max);
    }
    public static int gcd(int a, int b){
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(gcd_array(arr));
    }
}