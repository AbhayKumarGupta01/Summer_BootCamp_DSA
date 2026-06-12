import java.util.*;
class Rotate_String{
    public static boolean Check_String(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String combined = s+s;
        return combined.contains(goal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        
        boolean result = Check_String(s, goal);
        System.out.println(result);
    }
}