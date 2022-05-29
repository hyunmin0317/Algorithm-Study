import java.util.Scanner;

public class Baekjoon2606 {
    static int N, M;
    static int cnt=-1;
    static boolean[][] vertex;
    static boolean[] visit;

    public static void dfs(int i) {
        if (visit[i])
            return;

        visit[i] = true;
        cnt++;

        for (int j = 1; j <= N; j++) {
            if (!visit[j] && vertex[i][j]) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        vertex=new boolean[N+1][N+1];
        visit=new boolean[N+1];

        for (int i=0; i<M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            vertex[x][y] = vertex[y][x] = true;
        }

        dfs(1);
        System.out.println(cnt);
    }
}