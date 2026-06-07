import java.util.*;
class Leaders_in_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Leaders in the array: ");
        for(int i=0; i<n; i++){
              boolean leader = true;
            for(int j= i+1; j<n; j++){
                if(arr[j]>arr[i]){
                   leader=false;
                   break;
                }
            }
        if(leader){
            System.out.print(arr[i]+ " ");
        }
        }
    }
}