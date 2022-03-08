import java.io.*;
import java.util.*;

public class Main {
	static Queue<int[]> queue;
	static int M ,N;
	static int[][] vertex;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		M = Integer.parseInt(str[0]);
		N = Integer.parseInt(str[1]);
		vertex = new int[N][M];
		queue = new LinkedList();

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				vertex[i][j] = Integer.parseInt(str[j]);
				if (vertex[i][j] == 1)
					queue.add(new int[]{i, j});
			}
		}
		bfs();
		System.out.println(ans());
	}

	public static int ans() {
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (vertex[i][j] == 0) {
					return -1;
				}
				max = Math.max(max, vertex[i][j]);
			}
		}
		return max-1;
	}

	public static void bfs() {
		while (!queue.isEmpty()) {
			int[] num = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = num[0] + dx[i];
				int nextY = num[1] + dy[i];
				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M || vertex[nextX][nextY] != 0)
					continue;
				vertex[nextX][nextY] = vertex[num[0]][num[1]] + 1;
				queue.add(new int[]{nextX, nextY});
			}
		}
	}
}