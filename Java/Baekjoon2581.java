import java.util.Scanner;

public class Baekjoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0, num = 0;
        int M = sc.nextInt();
        int N = sc.nextInt();

        for(i=M; i<=N; i++) {
            if (isPrime(i)) {
                if (sum==0)
                    num = i;
                sum += i;
            }
        }
        if (sum==0)
            System.out.println(-1);
        else
            System.out.println(sum+"\n"+num);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i<=(int)Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
