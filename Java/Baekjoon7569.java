import java.io.*;
import java.util.*;

public class Baekjoon7569 {
    static Queue<int[]> queue;
    static int M ,N, H;
    static int[][][] vertex;
    static int[] dx = { -1, 1, 0, 0, 0, 0 };
    static int[] dy = { 0, 0, -1, 1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        H = Integer.parseInt(str[2]);
        vertex = new int[N][M][H];
        queue = new LinkedList();

        for (int k = 0; k < H; k++)
            for (int i = 0; i < N; i++) {
                str = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    vertex[i][j][k] = Integer.parseInt(str[j]);
                    if (vertex[i][j][k] == 1)
                        queue.add(new int[]{i, j, k});
                }
            }
        bfs();
        System.out.println(ans());
    }

    public static int ans() {
        int max = 0;
        for (int k = 0; k < H; k++)
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (vertex[i][j][k] == 0) {
                        return -1;
                    }
                    max = Math.max(max, vertex[i][j][k]);
                }
            }
        return max-1;
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            for (int i = 0; i < 6; i++) {
                int nextX = num[0] + dx[i];
                int nextY = num[1] + dy[i];
                int nextZ = num[2] + dz[i];
                if (nextX < 0 || nextY < 0 || nextZ < 0 || nextX >= N || nextY >= M || nextZ >= H || vertex[nextX][nextY][nextZ] != 0)
                    continue;
                vertex[nextX][nextY][nextZ] = vertex[num[0]][num[1]][num[2]] + 1;
                queue.add(new int[]{nextX, nextY, nextZ});
            }
        }
    }
}
