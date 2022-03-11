import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, N, T = sc.nextInt();
		int MAX = 101;
		long[] list = new long[MAX];

		list[1]=1;
		list[2]=1;

		for (i=3; i<MAX; i++)
			list[i] = list[i-2] + list[i-3];

		for (i=0; i<T; i++) {
			N = sc.nextInt();
			System.out.println(list[N]);
		}
	}
}