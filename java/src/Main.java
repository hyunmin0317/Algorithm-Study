import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
	static int M, N, K;
	static int[][] cabbage;
	static boolean[][] visit;
	static int count;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};

	public static void dfs(int x, int y) {
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < M && cy < N)
				if (!visit[cx][cy] && cabbage[cx][cy] == 1)
					dfs(cx, cy);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i=0; i<T; i++) {
			count = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			cabbage = new int[M][N];
			visit = new boolean[M][N];

			for (int j=0; j<K; j++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
				cabbage[X][Y] = 1;
			}

			for (int x = 0; x < M; x++) {
				for (int y = 0; y < N; y++) {
					if (cabbage[x][y] == 1 && !visit[x][y]) {
						dfs(x, y);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}