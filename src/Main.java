import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i, N=42, sum=0;
		Scanner sc = new Scanner(System.in);
		int[] list = new int[N];

		for (i=0; i<10; i++)
			list[sc.nextInt()%N]++;

		for (i=0; i<N; i++) {
			if (list[i]!=0)
				sum++;
		}
		System.out.println(sum);
	}
}