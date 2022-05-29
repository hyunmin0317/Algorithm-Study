import java.util.*;

class Number implements Comparable {
    int x;
    int y;

    @Override
    public int compareTo(Object n) {
        if (this.y == ((Number)n).y)
            return this.x - ((Number)n).x;
        return this.y - ((Number)n).y;
    }
}
public class Baekjoon1931_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num, cnt=0;
        Number[] numbers = new Number[N];
        for (int i=0;i<N;i++) {
            numbers[i] = new Number();
            numbers[i].x = sc.nextInt();
            numbers[i].y = sc.nextInt();
        }
        Arrays.sort(numbers);

        num=numbers[0].y;
        cnt++;

        for (int i=1;i<N;i++) {
            if (numbers[i].x>=num) {
                num=numbers[i].y;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}