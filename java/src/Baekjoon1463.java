import java.util.Scanner;

import static java.lang.Math.min;

public class Baekjoon1463 {
    static int N, num;
    static int MAX=1000001;
    static int[] cal=new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        cal[1] = 0;
        for (int i=2;i<=N;i++) {
            num=cal[i-1];
            if (i%2==0)
                num = min(num,cal[i/2]);
            if (i%3==0)
                num = min(num,cal[i/3]);
            cal[i] = num+1;
        }
        System.out.println(cal[N]);
    }
}
