import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num, cnt=0;
		Number[] numbers = new Number[N];
		for (int i=0;i<N;i++) {
			numbers[i] = new Number();
			numbers[i].x = sc.nextInt();
			numbers[i].y = sc.nextInt();
		}
		Arrays.sort(numbers);

		num=numbers[0].y;
		cnt++;

		for (int i=1;i<N;i++) {
			if (numbers[i].x>=num) {
				num=numbers[i].y;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}