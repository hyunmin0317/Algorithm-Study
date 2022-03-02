import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			list.add(num);
			goldbach((Integer) list.get(i));
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

	public static void goldbach(int num) {
		int start = num/2;
		int end = num/2;
		while (true) {
			if (isPrime(start)&&isPrime(end)) {
				System.out.println(start+" "+end);
				break;
			}
			start--;
			end++;
		}
	}
}