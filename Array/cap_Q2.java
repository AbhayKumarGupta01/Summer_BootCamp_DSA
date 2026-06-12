
import java.util.*;

// Minimum Merge Operations to Make an Array Palindrome
class cap_Q2{
    public static int Palindrome_Check(int arr[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
        list.add(num);
        }
        int count =0;
        while(list.size()>1){
            int left =0;
            int right = list.size() -1;

            if(list.get(left) == list.get(right)){
                list.remove(right);
                list.remove(left);
            }
            else if(list.get(left) < list.get(right)){
               int sum = list.get(left)+ list.get(left+1);
               list.set(left+1,sum);
               list.remove(left);
               count++;
            }
            else{
               int sum = list.get(right)+ list.get(right-1);
               list.set(right-1,sum);
               list.remove(right);
               count++;
        }
        
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = Palindrome_Check(arr);
        System.out.println(result);

    }
}