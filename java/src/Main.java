import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coins = new int[N];
		for (int i=0; i<N; i++)
			coins[i] = sc.nextInt();

		for (int j=N-1; j>=0; j--) {
			while (K>=coins[j]) {
				K -= coins[j];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}