import java.util.Scanner;

public class Main {

	public static class Point {
		long x;
		long y;

		public Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0L;
		int N = sc.nextInt();
		Point[] points = new Point[N+1];

		for (int i=0; i<N; i++)
			points[i] = new Point(sc.nextInt(), sc.nextInt());

		points[N] = points[0];
		for (int i = 0; i < N; i++)
			sum += points[i].x * points[i + 1].y - points[i].y * points[i + 1].x;

		System.out.println(String.format("%.1f", Math.abs(sum) / 2D));
	}
}