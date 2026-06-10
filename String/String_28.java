// Remove duplicate characters

import java.util.*;
class String_28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        HashSet<Character> set = new HashSet<>();
        for(char ch : arr){
            set.add(ch);
        }
        for(char ch: set){
            System.out.print(ch +" ");
        }

    }
}