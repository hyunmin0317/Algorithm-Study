import java.util.*;

public class Main {
	static void sort(String[] arr, int N) {
		String temp;
		for(int i = 0; i < N - 1; i++) {
			for(int j= 1 ; j < N-i; j++) {
				String str1 = arr[j - 1] + arr[j];
				String str2 = arr[j] + arr[j - 1];
				if(str1.compareTo(str2) < 0) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();;
		String[] array = new String[N];
		String answer = "";
		for(int i=0;i<N;i++) {
			array[i]=sc.next();
		}

		sort(array, N);
		for (String num:array)
			answer += num;

		StringBuffer sb = new StringBuffer(answer);
		if (sb.charAt(0) == '0')
			System.out.println('0');
		else
			System.out.println(answer);
	}
}