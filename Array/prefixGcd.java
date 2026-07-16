import java.util.*;
public class prefixGcd{
    public static long gcdSum(int[] nums){
        int n = nums.length;
        int prefixSum[] = new int[n];

        int mx = 0;
        for(int i=0; i<n; i++){
            mx = Math.max(nums[i], mx);
            prefixSum[i] = gcd(nums[i], mx);
        }
        Arrays.sort(prefixSum);

        long sum = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            sum += gcd(prefixSum[left], prefixSum[right]);
            left++;
            right--;
        }
        return sum;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(gcdSum(nums));
    }
}