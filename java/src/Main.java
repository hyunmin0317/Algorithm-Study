import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();;
		String[] array = new String[N];
		for(int i=0;i<N;i++) {
			array[i]=sc.next();
		}

		sort(array, N);

		for (String num:array)
			System.out.println(num);

	}

	static void sort(String[] arr, int N) {
		String temp;
		for(int i = 0; i < N - 1; i++) {
			for(int j= 1 ; j < N-i; j++) {
				if(Integer.parseInt(arr[j - 1] + arr[j]) < Integer.parseInt(arr[j] + arr[j - 1])) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}