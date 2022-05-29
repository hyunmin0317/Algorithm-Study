import java.util.Scanner;

public class Baekjoon11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt[] = new int[1001];
        int n = sc.nextInt();

        cnt[1] = 1;
        cnt[2] = 2;
        for (int i=3; i<=n; i++)
            cnt[i] = (cnt[i-1]+cnt[i-2])%10007;
        System.out.println(cnt[n]);
    }
}
