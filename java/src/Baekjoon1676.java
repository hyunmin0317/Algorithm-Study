import java.util.Scanner;

public class Baekjoon1676 {
    public static void main(String[] args) {
        int N, num, cnt = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 1; i <= N; i++)
            if (i % 5 == 0) {
                num=i;
                while (num % 5 == 0) {
                    num/=5;
                    cnt++;
                }
            }
        System.out.println(cnt);
    }
}
