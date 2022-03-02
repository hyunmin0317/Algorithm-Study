import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, num, cnt = 0;

		for (i=0; i<N; i++) {
			num = sc.nextInt();
			if (isPrime(num))
				cnt++;
		}
		System.out.println(cnt);
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i<=(int)Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}