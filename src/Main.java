import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp=0, num=1, ans=1;
		int N = sc.nextInt();

		while (true) {
			if (tmp<=N&&N<=num)
				break;
			tmp = num+1;
			num += 6*ans++;
		}
		System.out.println(ans);
	}
}