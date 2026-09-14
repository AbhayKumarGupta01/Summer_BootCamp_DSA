import java.util.*;

public class RectangleOverlap {

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int left = Math.max(rec1[0], rec2[0]);
        int right = Math.min(rec1[2], rec2[2]);

        int bottom = Math.max(rec1[1], rec2[1]);
        int top = Math.min(rec1[3], rec2[3]);

        return left < right && bottom < top;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rec1 = new int[4];
        int[] rec2 = new int[4];

        System.out.println("Enter rec1 (x1 y1 x2 y2):");
        for (int i = 0; i < 4; i++) {
            rec1[i] = sc.nextInt();
        }

        System.out.println("Enter rec2 (x1 y1 x2 y2):");
        for (int i = 0; i < 4; i++) {
            rec2[i] = sc.nextInt();
        }

        boolean result = isRectangleOverlap(rec1, rec2);

        System.out.println(result);

        sc.close();
    }
}