import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end;
		int N = sc.nextInt();
		long sum, min = 3000000000L;
		long[] num = new long[N];
		long[] ans = new long[3];

		for (int i=0; i<N; i++)
			num[i] = sc.nextInt();
		Arrays.sort(num);

		for (int i=0; i<N-2; i++) {
			start = i+1;
			end = N-1;
			while (start < end) {
				sum = num[start]+num[end]+num[i];

				if (Math.abs(sum) < min) {
					ans[0] = num[start];
					ans[1] = num[end];
					ans[2] = num[i];
					min = Math.abs(sum);
				}

				if (sum > 0)
					end--;
				else
					start++;
			}
		}

		Arrays.sort(ans);
		System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
	}
}