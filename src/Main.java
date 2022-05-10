import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hour, minute;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();

		if (minute<45) {
			minute += 15;
			hour--;
			if (hour==-1)
				hour = 23;
		} else
			minute -= 45;

		System.out.println(hour+" "+minute);
	}
}