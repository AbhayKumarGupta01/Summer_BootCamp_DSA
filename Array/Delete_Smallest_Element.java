import java.util.Scanner;

class Delete_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minindex = 0;

        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[minindex]) {
                minindex = i;
            }
        }

        for(int j = minindex; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        n--;

        System.out.println("Array After Deletion:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
