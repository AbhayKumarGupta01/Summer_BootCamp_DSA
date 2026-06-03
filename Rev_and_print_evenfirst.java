import java.util.*;
class Rev_and_print_evenfirst{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        for(int num : list){
            if(num%2==0){
                System.out.print(num + " ");
            }
        }
        for(int num : list){
            if(num%2!=0){
                System.out.print(num+ " ");
            }
        }
    }
}