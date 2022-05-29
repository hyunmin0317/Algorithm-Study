import java.util.Scanner;


public class Baekjoon15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 31, M = 1234567891;
        long sum = 0, pow = 1;
        int i, L = sc.nextInt();
        String str = sc.next();

        for (i=0; i<L; i++) {
            sum += (str.charAt(i)-'a'+1) * pow % M;
            pow = pow * r % M;
        }
        System.out.println(sum % M);
    }
}
