import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1987 {
    static int R, C;
    static int ans = 0;
    static int[][] board;
    static boolean[] visit = new boolean[26];
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void dfs(int x, int y, int cnt) {
        if (visit[board[x][y]]) {
            ans = Math.max(ans, cnt);
            return;
        }
        else {
            visit[board[x][y]] = true;
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < R && cy < C)
                    dfs(cx, cy, cnt+1);
            }
            visit[board[x][y]] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new int[R][C];

        for (int i=0; i<R; i++) {
            String a = br.readLine();
            for (int j=0; j<C; j++)
                board[i][j] = a.charAt(j)-'A';
        }

        dfs(0,0, 0);
        System.out.println(ans);
    }
}
