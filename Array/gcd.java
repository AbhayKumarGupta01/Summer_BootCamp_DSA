class gcd {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 4;
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        System.out.println(gcd(sumOdd, sumEven));
    }
}