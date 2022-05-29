import java.util.Scanner;

public class Baekjoon9095 {
    public static void main(String[] args) {
        int T, n=11;
        int[] cnt = new int[n];
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();

        cnt[1]=1;
        cnt[2]=2;
        cnt[3]=4;

        for (int i=4; i<n; i++)
            cnt[i] = cnt[i-1] + cnt[i-2] + cnt[i-3];

        for (int i=0; i<T; i++)
            System.out.println(cnt[sc.nextInt()]);
    }
}
