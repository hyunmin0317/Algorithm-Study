import java.util.*;

public class Main {
	public static int[][] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int N=sc.nextInt();
		list = new int[N][N];

		for (i=0; i<N; i++)
			for (j=0; j<N; j++)
				list[i][j] = sc.nextInt();

		for (i=0; i<N; i++)
			for (j=0; j<N; j++)
				System.out.println(list[i][j]);
	}
}