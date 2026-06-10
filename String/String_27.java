/* 
Pattern replacement
str1 = ABCABCXABCXYbw
pattern = ABC
repalce_with = *
*/
import java.util.*;
class String_27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String pattern = sc.nextLine();
        char repalce_with = sc.next().charAt(0);

        
            if(str1.contains(pattern)){
                str1 = str1.replace(pattern, String.valueOf(repalce_with));
            }
            System.out.println("String is: " +str1);
            }
        }