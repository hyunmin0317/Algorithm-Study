import java.util.Scanner;

public class Baekjoon11659 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N+1];
        for (int i=1; i<=N; i++)
            numbers[i] = numbers[i-1]+sc.nextInt();

        for (int j=0; j<M; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(numbers[b]-numbers[a-1]);
        }
    }
}
