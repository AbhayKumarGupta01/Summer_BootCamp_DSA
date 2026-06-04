import java.util.*;
class Count_of_elemLL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n ; i++){
            list.add(sc.nextInt());
        }
        int cnt = 0;
        for(int num : list){
            System.out.print(num + "->");
            cnt++;
        }
        System.out.println("null");
        System.out.println("No of elements are: " + cnt);
    }
}
