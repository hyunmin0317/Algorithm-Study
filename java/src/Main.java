import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (true) {
			n=sc.nextInt();
			if (n==0)
				break;
			System.out.println(count(n));
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i<=(int)Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static int count(int num) {
		int cnt=0;
		for (int i=num+1;i<=num*2;i++) {
			if (isPrime(i))
				cnt++;
		}
		return cnt;
	}
}