import java.util.Scanner;
class Longest_Consecutive_inc_subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxLen=1;
        int currLen=1;
        for(int i=1; i<n; i++){
                if(arr[i] > arr[i-1]){
                   currLen++;
            }
            else{
                currLen=1;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        System.out.println("Maximum length of Longest Consecutive Subarray is: " +maxLen);
    }
}