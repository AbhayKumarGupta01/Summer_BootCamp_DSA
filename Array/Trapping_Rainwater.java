
import java.util.Scanner;

class Trapping_Rainwater {
// Using 2 Pointer

    int trap(int arr[]) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while (l < r) {
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);

            if (lmax < rmax) {
                ans += lmax - arr[l];
                l++;
            } else {
                ans += rmax - arr[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Trapping_Rainwater obj = new Trapping_Rainwater();
        System.out.println("Max Trapped Water is: " + obj.trap(arr));

// --------------------------ANOTHER APPROACH----------------------------------------------------------//
        /*int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0]  = arr[0];
        rightmax[n-1]  = arr[n-1];

        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }
        int ans=0;
        for(int i=0; i<n; i++){
            ans += Math.min(leftmax[i], rightmax[i]) - arr[i];
        }
        System.out.println("Max Trap Water is: " +ans);
         */


    }
}
