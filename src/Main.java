import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum=1;
		int[] num = new int[10];

		for (i=0; i<3; i++) {
			n = sc.nextInt();
			sum *= n;
		}

		while (sum!=0) {
			num[sum%10]++;
			sum /= 10;
		}

		for (i=0; i<10; i++) {
			System.out.println(num[i]);
		}
	}
}