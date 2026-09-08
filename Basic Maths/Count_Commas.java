import java.util.*;
public class Count_Commas{
    static int count(int x){
        if(x < 1000){
            return 0;
        }
        return x - 999;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
    }
}