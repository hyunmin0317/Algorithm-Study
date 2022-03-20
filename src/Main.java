import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MAX = 101;
	static boolean[] visit = new boolean[MAX];
	static int[] list = new int[MAX];
	static int[] arr = new int[MAX];

	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList();
		visit[x] = true;
		queue.add(x);

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 1; i <= 6; i++) {
				int go = temp+i;

				if (go >= 0 && go <= 100) {
					if (list[go]!=0)
						go = list[go];
					if (!visit[go]) {
						queue.add(go);
						arr[go] = arr[temp] + 1;
						visit[go] = true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int N, M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i=0; i<N+M; i++)
			list[sc.nextInt()] = sc.nextInt();

		bfs(1);
		System.out.println(arr[100]);
	}
}