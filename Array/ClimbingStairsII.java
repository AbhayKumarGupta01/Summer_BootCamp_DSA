
import java.util.*;

public class ClimbingStairsII {

    public static int climbStairs(int n, int[] costs) {

        int[] dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        dist[0] = 0;

        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int step = curr[0];
            int cost = curr[1];

            if (cost > dist[step]) {
                continue;
            }

            if (step == n) {
                return cost;
            }

            for (int j = 1; j <= 3; j++) {

                int next = step + j;

                if (next <= n) {

                    int newCost =
                        cost + costs[next - 1] + j * j;

                    if (newCost < dist[next]) {

                        dist[next] = newCost;

                        pq.offer(new int[]{next, newCost});
                    }
                }
            }
        }

        return dist[n];
    }

    public static void main(String[] args) {

        int n = 4;
        int[] costs = {1, 2, 3, 4};

        System.out.println(climbStairs(n, costs));
    }
}
