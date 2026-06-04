import java.util.*;
class Occurences_of_LL{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for(int i =0; i<n; i++){
        list.add(sc.nextInt());
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num: list){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }
        else{
        map.put(num, 1);
        }
    }
    for(int num1 : map.keySet()){
        System.out.println(num1 + ":" + map.get(num1));
    }
}
}
