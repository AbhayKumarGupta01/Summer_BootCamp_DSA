import java.util.*;
class ProductOfTheLastKNumbers {
    ArrayList<Integer> prefix;
    public ProductOfTheLastKNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1);
    }
    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            prefix.add(1);
        } 
        else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }
    public int getProduct(int k) {
        int n = prefix.size();
        if (k >= n) {
            return 0;
        }
        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOfTheLastKNumbers obj =
            new ProductOfTheLastKNumbers();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            obj.add(num);
        }
        int k = sc.nextInt();
        System.out.println(obj.getProduct(k));
        sc.close();
    }
}
