import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, N = sc.nextInt();

		for (i=1; i<=N; i++) {
			System.out.print(" ".repeat(N-i));
			System.out.println("*".repeat(i));
		}

	}
}