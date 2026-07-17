import java.util.Scanner;
class IsomorphicStrings{
    public static boolean Isomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int mapS[] = new int[256];
        int mapT[] = new int[256];

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapS[c1] != mapT[c2]){
                return false;
            }
            mapS[c1] = i+1;
            mapT[c2] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(Isomorphic(s, t));
        sc.close();
    }
}