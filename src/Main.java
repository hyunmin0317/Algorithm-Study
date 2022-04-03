import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, mid, sum;
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[] num = new int[N];
		int[] ans = new int[2];

		for (int i=0; i<N; i++)
			num[i] = sc.nextInt();

		for (int i=0; i<N; i++) {
			start = i+1;
			end = N-1;
			while (start <= end) {
				mid = (start+end)/2;
				sum = num[i] + num[mid];

				if (Math.abs(sum) < min) {
					ans[0] = num[i];
					ans[1] = num[mid];
					min = Math.abs(sum);
				}

				if (sum < 0)
					start = mid+1;
				else
					end = mid-1;
			}
		}

		System.out.println(ans[0]+" "+ans[1]);
	}
}