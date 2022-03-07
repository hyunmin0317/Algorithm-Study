import java.util.*;

public class Main {
	static Queue<int[]> queue;
	static int[][] list;
	static boolean[][] visit;
	static int N, M;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};

	public static void bfs(int x, int y) {
		visit[x][y] = true;
		queue.add(new int[]{x, y});

		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			for (int i = 0; i < 4; i++) {
				int cx = temp[0] + dx[i];
				int cy = temp[1] + dy[i];

				if (cx >= 0 && cy >= 0 && cx < N && cy < M) {
					if (!visit[cx][cy] && list[cx][cy] != 0) {
						queue.add(new int[]{cx, cy});
						list[cx][cy] = list[temp[0]][temp[1]]+1;
						visit[cx][cy] = true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers;
		N=sc.nextInt();
		M=sc.nextInt();
		list = new int[N][M];
		visit = new boolean[N][M];
		queue = new LinkedList();

		for (int i=0; i<N; i++) {
			numbers=sc.next().split("");
			for (int j=0; j<M; j++)
				list[i][j]=Integer.parseInt(numbers[j]);
		}

		bfs(0,0);
		System.out.println(list[N-1][M-1]);
	}
}