import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, k, n, T = sc.nextInt();

		for (i=0; i<T; i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			System.out.println(fun(k, n));
		}
	}

	public static int fun(int k, int n) {
		if (k==0)
			return n;
		else if (n==1)
			return 1;
		else
			return fun(k, n-1)+fun(k-1, n);
	}
}