import java.util.*;

class Array_Rank_Transform {

    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = arrayRankTransform(arr);

        System.out.println("Rank Transformed Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}