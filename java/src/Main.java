import java.util.Scanner;

public class Main {
	static int K, N;

	public static void main(String args[]) {
		int max=0;
		int i, j;
		String ans = "";
		String[] num;
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		N = sc.nextInt();
		num = new String[N];

		for (i=0; i<K; i++) {
			num[i] = sc.next();
			if (max<Integer.parseInt(num[i]))
				max = Integer.parseInt(num[i]);
		}
		for (j=i; j<N; j++)
			num[j] = String.valueOf(max);
		sort(num);

		for (String n:num)
			ans += n;
		System.out.println(ans);
	}

	static void sort(String[] arr) {
		String temp;
		for(int i = 0; i < N - 1; i++) {
			for(int j= 1 ; j < N-i; j++) {
				String str1 = arr[j - 1] + arr[j];
				String str2 = arr[j] + arr[j - 1];
				if(str1.compareTo(str2) < 0) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}