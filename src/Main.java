import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, N, K, a=1, b=1;
		N = sc.nextInt();
		K = sc.nextInt();

		for (i=0; i<K; i++)
			a *= N--;
		for (i=1; i<=K; i++)
			b *= i;
		System.out.println(a/b);
	}
}