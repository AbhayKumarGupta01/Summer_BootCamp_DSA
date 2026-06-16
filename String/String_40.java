// First Non-Repeating Character in String
import java.util.*;
class String_40{
    static Character Non_Duplicate(String s){
        int freq[] = new int[256];
        for(char ch : s.toCharArray()){
            freq[ch]++; 
        }
        for(char ch : s.toCharArray()){
            if(freq[ch] == 1){
                return ch;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Non_Duplicate(s));
    }
}