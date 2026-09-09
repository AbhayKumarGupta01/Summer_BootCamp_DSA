public class CountCommasInRangeII {

    public static long countCommas(long n) {
        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long end = Math.min(n, start * 1000 - 1);

            ans += (end - start + 1) * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }

    public static void main(String[] args) {
        long n = 1004590;

        System.out.println(countCommas(n));
    }
}