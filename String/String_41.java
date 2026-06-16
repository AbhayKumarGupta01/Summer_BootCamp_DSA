//Decode compressed string

import java.util.*;

class String_41 {

    static String Decode_String(String s) {
        Stack<Integer> k = new Stack<>();
        Stack<StringBuilder> chr = new Stack<>();
        StringBuilder ans = new StringBuilder();
        //int repeat =0;
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                k.push(num);
                chr.push(ans);

                num = 0;
                ans = new StringBuilder();
            } else if (ch == ']') {
                int repeat = k.pop();
                StringBuilder prev = chr.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(ans);
                }

                ans = prev;
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Decode_String(s));
    }

}
