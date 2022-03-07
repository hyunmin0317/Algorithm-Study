import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] time = new int[N];
		for (int i=0; i<N; i++)
			time[i] = sc.nextInt();

		Arrays.sort(time);

		for (int i=0; i<N; i++)
			sum += time[i] * (N-i);
		System.out.println(sum);
	}
}