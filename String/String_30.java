// Check if two strings are anagram or not
import java.util.*;
class String_30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("String 1 and String 2 are Anagram");
            }
            else{
                System.out.println("String 1 and String 2 are not Anagram");
            }
        }
    }
