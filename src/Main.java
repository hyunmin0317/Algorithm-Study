import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, answer, N = sc.nextInt();
		int[] ans = new int[N+6];

		ans[3] = 1;
		ans[5] = 1;

		for (i=3; i<=N; i++) {
			if (ans[i]!=0) {
				if (ans[i+3]==0)
					ans[i+3] = ans[i]+1;
				if (ans[i+5]==0)
					ans[i+5] = ans[i]+1;
			}
		}

		answer = ans[N]==0 ? -1:ans[N];
		System.out.println(answer);
	}
}