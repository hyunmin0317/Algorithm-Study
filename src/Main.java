import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number;

		while (true) {
			number = sc.next();
			if (number.equals("0"))
				break;

			if (check(number))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

	public static boolean check(String num) {
		int i, len=num.length()-1;

		for (i=0; i<=len; i++)
			if (num.charAt(i)!=num.charAt(len-i))
				return false;
		return true;
	}
}