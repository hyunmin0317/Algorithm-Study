import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2667 {
    static int N;
    static int index=0;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] ans;
    static int[][] vertex;
    static boolean[][] visit;

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        ans[index]++;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N)
                if (vertex[cx][cy] == 1 && !visit[cx][cy])
                    dfs(cx, cy);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp;
        String[] temps;
        N = sc.nextInt();
        ans = new int[N*N];
        vertex = new int[N][N];
        visit = new boolean[N][N];

        for (int i=0; i<N; i++) {
            temp = sc.next();
            temps = temp.split("");
            for (int j=0; j < N; j++)
                vertex[i][j] = Integer.parseInt(temps[j]);
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(vertex[i][j] == 1 && !visit[i][j]){
                    index++;
                    dfs(i,j);
                }
            }
        }
        Arrays.sort(ans);
        System.out.println(index);
        for (int a:ans)
            if (a!=0)
                System.out.println(a);
    }
}
