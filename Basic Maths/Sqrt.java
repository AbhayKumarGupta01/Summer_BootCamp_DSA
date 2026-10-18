import java.util.*;
class Sqrt{
    public static int root(int n){
        int left = 0;
        int right = n;
        int ans = 0;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(mid == 0 || mid <=  n / mid){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(root(n));
    }
}