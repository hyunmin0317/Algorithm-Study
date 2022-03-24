import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int[] arr, path;

	public static void bfs() {
		for (int i = 2; i <= N; i++) {
			if(i%3 == 0) {
				if(arr[i/3] +1 < arr[i]) {
					arr[i] = arr[i/3] +1;
					path[i] = i/3;
				}
			}

			if(i%2 == 0) {
				if(arr[i/2] +1 < arr[i]) {
					arr[i] = arr[i/2] +1;
					path[i] = i/2;
				}
			}

			if(arr[i-1] +1 < arr[i]) {
				arr[i] = arr[i-1] +1;
				path[i] = i-1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		arr = new int[N+1];
		path = new int[N+1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[1] = 0;
		bfs();

		System.out.println(arr[N]);
		while (N > 0) {
			System.out.print(N+" ");
			N = path[N];
		}
	}
}