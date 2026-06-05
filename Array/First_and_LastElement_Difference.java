
import java.util.*;

class First_and_LastElement_Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int diff = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            diff = arr[n - 1] - arr[0];
        }
        System.out.println("Difference between first and last element of array is: " + diff);
    }

}
