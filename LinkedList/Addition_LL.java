import java.util.*;
class Addition_LL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int i=0; i<n ; i++){
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i=0; i<m ; i++){
            list2.add(sc.nextInt());
        }
         

        LinkedList<Integer> result = new LinkedList<>();
        int size = Math.min(list1.size(), list2.size());
        for(int i = 0; i < size; i++) {
            result.add(list1.get(i) + list2.get(i));
        }

        // printing resultant list
        for(int num3 : result){
            System.out.print(num3 + " ->");
        }  
        System.out.print("null");
        }
    }
