// Find first non-repeating character

import java.util.*;
class String_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0; i<n; i++){
           // for(int j=i+1; j<n; j++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                System.out.println(arr[i]);
                break;
            }
        
        }
    }
}