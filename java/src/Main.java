import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
	static int N, M, result;
	static boolean[] number = new boolean[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i=0; i<M; i++)
			number[sc.nextInt()] = true;

		result = abs(N - 100);
		for (int i=0; i<1000000; i++) {
			String num = String.valueOf(i);
			int len = num.length();
			boolean Break = false;

			for (int j=0; j<len; j++) {
				if (number[num.charAt(j) - '0']) {
					Break = true;
					break;
				}
			}
			if(!Break) {
				int min = Math.abs(N - i) + len;
				result = Math.min(min, result);
			}
		}
		System.out.println(result);
	}
}