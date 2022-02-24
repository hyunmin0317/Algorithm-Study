import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();;
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}

		sort(array, N);

		for (int num:array)
			System.out.println(num);

	}

	static void sort(int[] arr, int N) {
		int temp = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j= 1 ; j < N-i; j++) {
				if(arr[j]>arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}