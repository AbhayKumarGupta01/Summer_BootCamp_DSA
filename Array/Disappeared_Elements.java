import java.util.*;
class Disappeared_Elements {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
       HashSet<Integer> s = new HashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
       for(int num : nums){
       s.add(num);
       }
       for(int i=1; i<=n; i++){
        if(!s.contains(i)){
            list.add(i);
        }
       }
       return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findDisappearedNumbers(nums));

    }
}