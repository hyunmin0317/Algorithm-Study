import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
			int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
			double length = sqrt(pow((x1-x2), 2) + pow((y1-y2), 2));

			if (x1==x2&&y1==y2&&r1==r2)
				System.out.println(-1);
			else {
				if (r1+r2>length && abs(r1-r2)<length)
					System.out.println(2);
				else if (r1+r2==length || abs(r1-r2)==length)
					System.out.println(1);
				else	// r1+r2<length || abs(r1-r2)>length
					System.out.println(0);
			}
		}
	}
}