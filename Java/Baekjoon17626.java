import java.util.Scanner;

import static java.lang.Math.min;

public class Baekjoon17626 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min, n = sc.nextInt();
        int[] number = new int[n+1];
        number[1] = 1;

        for (int i=2; i<=n; i++) {
            min=5;
            for (int j=1; j*j<=i; j++) {
                int tmp = i-j*j;
                min = min(min, number[tmp]);
            }
            number[i] = min+1;
        }
        System.out.println(number[n]);
    }
}
