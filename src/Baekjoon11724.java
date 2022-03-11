import java.util.Scanner;

public class Baekjoon11724 {
    public static int N, M;
    public static boolean[][] vertex;
    public static boolean[] visit;

    public static void dfs(int n) {
        visit[n] = true;

        for (int i = 1; i <= N; i++) {
            if (!visit[i] && vertex[n][i])
                dfs(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int count=0;
        N = sc.nextInt();
        M = sc.nextInt();
        vertex = new boolean[N+1][N+1];
        visit = new boolean[N+1];

        for (int i=0; i<M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            vertex[x][y]=vertex[y][x]=true;
        }

        for (x = 1; x <= N; x++) {
            if (!visit[x]) {
                dfs(x);
                count++;
            }
        }
        System.out.println(count);
    }
}
