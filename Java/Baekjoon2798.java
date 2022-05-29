import java.util.Scanner;

public class Baekjoon2798 {
    public static void main(String[] args) {
        int i, j, k, N, M;
        int sum, max=0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] cards = new int[N];

        for (i=0; i<N; i++)
            cards[i] = sc.nextInt();

        for (i=0; i<N; i++)
            for (j=i+1; j<N; j++)
                for (k=j+1; k<N; k++) {
                    sum = cards[i]+cards[j]+cards[k];
                    if (max < sum && sum <= M)
                        max = sum;
                }
        System.out.println(max);
    }
}
