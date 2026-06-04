import java.util.*;
class Duplicate_RemoveLL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n ; i++){
            list.add(sc.nextInt());
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: list){
            set.add(num);
        }
        for(int num1: set){
            System.out.print(num1 + " -> ");
        }
        System.out.print("null");
    }
}
