import java.util.*;
class Middle_of_LL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int middle = list.get(n/2);
        System.out.print(middle);
    }
}