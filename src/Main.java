import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i, index, N=26;
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[N];
		String word = sc.next();

		for (i=0; i<N; i++)
			alphabet[i] = -1;

		for (i=0; i<word.length(); i++) {
			index = word.charAt(i)-'a';
			if (alphabet[index]==-1)
				alphabet[index] = i;
		}

		for (i=0; i<N; i++)
			System.out.print(alphabet[i]+" ");
	}
}