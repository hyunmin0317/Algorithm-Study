import java.util.*;

public class Baekjoon1260 {
    static Queue<Integer> queue;
    static boolean[][] vertex;
    static boolean[] visit;
    static int MAX = 1001;
    static int N, M, V;

    public static void dfs(int i) {
        System.out.print(i+" ");
        visit[i] = true;

        for (int j=1;j<=N;j++) {
            if (vertex[i][j] && !visit[j])
                dfs(j);
        }
    }

    public static void bfs(int i) {
        System.out.print(i + " ");
        visit[i] = true;
        queue.offer(i);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int j = 1; j <= N; j++) {
                if(vertex[temp][j] && !visit[j]) {
                    System.out.print(j + " ");
                    visit[j] = true;
                    queue.offer(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue = new LinkedList();
        vertex = new boolean[MAX][MAX];
        visit = new boolean[MAX];

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        for (int i=0; i<M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            vertex[x][y] = vertex[y][x] = true;
        }

        dfs(V);
        System.out.println();
        visit = new boolean[MAX];
        bfs(V);
    }
}