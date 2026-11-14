import java.util.*;
class MinimumPositiveSumSubarray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        for(int k = l; k < r && k < n; k++){
            int sum = 0;
            for(int i=0; i<k; i++){
                sum += nums.get(i);
            }
            if(sum > 0){
                min = Math.min(min, sum);
            }
            for(int j=k; j<n; j++){
                sum = sum + nums.get(j) - nums.get(j-k);
            }
            if (sum > 0) {
                    min = Math.min(min, sum);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(minimumSumSubarray(nums, l, r));
    }
}