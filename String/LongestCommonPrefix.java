import java.util.*;
class LongestCommonPrefix{
    public static String longestcomonprefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0 , prefix.length()-1);
                if(prefix.length() == 0){
                    return "";
                }
            }
        }
         return prefix;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     String strs[] = new String[n];
     sc.nextLine();
     for(int i=0; i<n; i++){
        strs[i] = sc.nextLine();
     }  
     System.out.println(longestcomonprefix(strs));
    }
}