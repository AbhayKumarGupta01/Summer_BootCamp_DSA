
import java.util.*;

class Rev_and_Remove_Duplicates {

    //public static void main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        HashSet<Integer> set = new HashSet<>(list);
        LinkedList<Integer> result = new LinkedList<>(set);
        Collections.reverse(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
