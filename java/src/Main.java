import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
	static int[] ans, list;

	static int find(int n) {
		if (ans[n]==0 && n>2)
			ans[n] = max(find(n-2), find(n-3)+list[n-1]) +list[n];
		return ans[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ans = new int[N+1];
		list = new int[N+1];

		for (int i=1; i<=N; i++)
			list[i] = sc.nextInt();

		ans[1]=list[1];
		if (N!=1)
			ans[2]=list[1]+list[2];

		System.out.println(find(N));
	}
}