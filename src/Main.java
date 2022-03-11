import java.util.Scanner;

public class Main {
	public static String make(int n) {
		String str = "I";
		for (int i=0; i<n; i++)
			str += "OI";
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextInt();
		String search = make(N);
		String S = sc.next();
		int i, cnt=0;

		i = S.indexOf(search);
		while (i!=-1) {
			i = S.indexOf(search, i+1);
			cnt++;
		}
		System.out.println(cnt);
	}
}