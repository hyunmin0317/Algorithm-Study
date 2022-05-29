import java.util.Scanner;

public class Baekjoon1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, N = sc.nextInt();
        for (int i=0; i<N; i++) {
            num = sc.nextInt();
            System.out.println(fibonacci0(num)+" "+fibonacci1(num));
        }
    }
    public static int fibonacci0(int n) {
        Integer[] array = new Integer[n+2];
        array[0] = 1;
        array[1] = 0;

        for (int i=2; i<=n;i++)
            array[i] = array[i-2] + array[i-1];
        return array[n];
    }
    public static int fibonacci1(int n) {
        Integer[] array = new Integer[n+2];
        array[0] = 0;
        array[1] = 1;

        for (int i=2; i<=n;i++)
            array[i] = array[i-2] + array[i-1];
        return array[n];
    }
}
