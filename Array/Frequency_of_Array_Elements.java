import java.util.*;
class Frequency_of_Array_Elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        int visited =-1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        for(int i=0; i<n; i++){
            int count =1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
                if(freq[i] != visited){
                    freq[i] = count;
                }
            }
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=visited){
                System.out.println("Frequency | count");
                System.out.println(arr[i] + "|" +  freq[i]);
            }
        }
    }
}