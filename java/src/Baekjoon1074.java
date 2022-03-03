import java.util.Scanner;

import static java.lang.Math.pow;

public class Baekjoon1074 {
    static int N, r, c;
    static int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = (int) pow(2, sc.nextInt());
        r = sc.nextInt();
        c = sc.nextInt();
        find(N, r, c);
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if(size == 1)
            return;

        if(r < size/2 && c < size/2) {
            find(size/2, r, c);
        }
        else if(r < size/2 && c >= size/2) {
            count += size * size / 4;
            find(size/2, r, c - size/2);
        }
        else if(r >= size/2 && c < size/2) {
            count += (size * size / 4) * 2;
            find(size/2, r - size/2, c);
        }
        else {
            count += (size * size / 4) * 3;
            find(size/2, r - size/2, c - size/2);
        }
    }
}
