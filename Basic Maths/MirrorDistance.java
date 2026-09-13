import java.util.*;

public class MirrorDistance {

    public int mirrorDistance(int n) {
        int orig = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return Math.abs(orig - rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MirrorDistance obj = new MirrorDistance();

        System.out.println(obj.mirrorDistance(n));

        sc.close();
    }
}