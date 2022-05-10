import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, X, N = sc.nextInt();
		X = sc.nextInt();

		for (i=0; i<N; i++) {
			num = sc.nextInt();
			if (num<X)
				System.out.print(num+" ");
		}
	}
}