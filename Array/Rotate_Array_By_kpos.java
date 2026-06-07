
import java.util.*;

class Rotate_Array_By_kpos {

    void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }

    public static void main(String[] args) {
        Rotate_Array_By_kpos obj = new Rotate_Array_By_kpos();
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int k = sc.nextInt();
        obj.rotate(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
