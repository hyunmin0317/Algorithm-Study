import java.util.*;

public class Baekjoon1697 {
    static int[] visit;

    public static int bfs(int start, int target) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(start);
        visit[start]++;

        while(!queue.isEmpty()) {
            int n = queue.poll();

            if (n == target)
                return visit[n]-1;

            if (n-1>=0 && visit[n-1] == 0) {
                visit[n-1] = visit[n]+1;
                queue.offer(n-1);
            }

            if (n+1 <= 100000 && visit[n+1] == 0) {
                visit[n+1] = visit[n]+1;
                queue.offer(n+1);
            }

            if (2*n <= 100000 && visit[2*n] == 0) {
                visit[2*n] = visit[n]+1;
                queue.offer(2*n);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N, K, MAX=100001;

        visit = new int[MAX];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        System.out.println(bfs(N, K));
    }
}