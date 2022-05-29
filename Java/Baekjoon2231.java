import java.util.Scanner;

public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N = sc.nextInt();

        for (i=0; i<N; i++) {
            if (fun(i)==N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static int fun(int n) {
        int sum = n;
        while (n!=0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
