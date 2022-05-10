import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n1 = change(n1);
		n2 = change(n2);

		if (n1>n2)
			System.out.println(n1);
		else
			System.out.println(n2);
	}

	public static int change(int num) {
		int i, sum=0;
		for (i=2; i>=0; i--) {
			sum += (num % 10) * pow(10, i);
			num /= 10;
		}
		return sum;
	}
}