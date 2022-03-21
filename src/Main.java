import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MAX = 10000;
	static Queue<Integer> queue = new LinkedList();
	static String[] ans;
	static boolean[] visit;

	public static void bfs(int x) {
		int D, S, L, R;
		visit = new boolean[MAX];
		ans = new String[MAX];
		for (int i=0; i<MAX; i++)
			ans[i] = "";

		visit[x] = true;
		queue.add(x);

		while(!queue.isEmpty()) {
			int temp = queue.poll();

			D = (temp*2) % 10000;
			S = (temp==0)?9999:temp-1;
			L = (temp%1000)*10+temp/1000;
			R = (temp%10)*1000+temp/10;

			if (!visit[D]) {
				queue.add(D);
				ans[D] = ans[temp] + "D";
				visit[D] = true;
			}
			if (!visit[S]) {
				queue.add(S);
				ans[S] = ans[temp] + "S";
				visit[S] = true;
			}
			if (!visit[L]) {
				queue.add(L);
				ans[L] = ans[temp] + "L";
				visit[L] = true;
			}
			if (!visit[R]) {
				queue.add(R);
				ans[R] = ans[temp] + "R";
				visit[R] = true;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			bfs(sc.nextInt());
			System.out.println(ans[sc.nextInt()]);
		}
	}
}