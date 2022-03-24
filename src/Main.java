import java.util.Scanner;

public class Main {
	static int M, N;
	static boolean[] visit;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visit = new boolean[N+1];
		arr = new int[M];
		dfs(0);
	}

	private static void dfs(int index) {
		if (index == M) {
			for (int num: arr)
				System.out.print(num+" ");
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if(!visit[i]) {
				arr[index] = i;
				visit[i] = true;
				dfs(index + 1);
				for (int j = i + 1; j <= N; j++)
					visit[j] = false;
			}
		}
	}
}