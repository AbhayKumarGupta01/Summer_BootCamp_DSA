import java.util.*;
class Deletion_Using_Prefix_Pattern{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    LinkedList<String> list = new LinkedList<>();
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
        list.add(sc.next());
    }
    String patt = sc.next();
            Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String str = it.next();

            if(str.startsWith(patt)) {
                it.remove();
            }
        }

        for(String str : list) {
            System.out.print(str+" ");
        }

    }
   
}