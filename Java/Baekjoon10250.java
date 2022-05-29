import java.util.Scanner;

public class Baekjoon10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int i, H, N, X, Y;

        for (i=0; i<M; i++) {
            H = sc.nextInt();
            sc.nextInt();
            N = sc.nextInt();

            X = N%H==0?H:N%H;
            Y = N%H==0?N/H:N/H+1;

            System.out.println(String.format("%d%02d", X, Y));
        }
    }
}
