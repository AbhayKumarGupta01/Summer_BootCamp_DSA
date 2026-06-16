// compress an string 

import java.util.*;

class String_Compression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();

        int idx = 0;
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            char ch1 = ch[i];
            int count = 0;
            while (i < n && ch[i] == ch1) {
                count++;
                i++;
            }
            if (count == 1) {
                ch[idx++] = ch1;
            }
            if (count > 1) {
                ch[idx++] = ch1;
                String str = String.valueOf(count);
                for (char digit : str.toCharArray()) {
                    ch[idx++] = digit;
                }
            }
            i--;
        }
        System.out.println(new String(ch, 0, idx));
    }
}
