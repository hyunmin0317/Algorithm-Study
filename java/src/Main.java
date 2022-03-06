import java.util.Scanner;

public class Main {
	public static int cal(String number) {
		int sum=0;
		String[] numbers = number.split("\\+");
		for (var num: numbers)
			sum+=Integer.parseInt(num);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		String[] plus;
		String str = sc.nextLine();
		String[] numbers = str.split("-");

		sum = cal(numbers[0]);
		for (int i=1;i<numbers.length;i++)
			sum -= cal(numbers[i]);
		System.out.println(sum);
	}
}