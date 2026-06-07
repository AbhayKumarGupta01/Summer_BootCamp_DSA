import java.util.Scanner;
class DNF{
    public void sortDNF(int arr[]){
        int low =0;
        int mid =0;
        int n = arr.length;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        DNF obj = new DNF();
        obj.sortDNF(arr);

    }
}