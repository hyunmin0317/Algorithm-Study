import java.util.Scanner;

import static java.lang.Math.pow;

public class Baekjoon4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        int max, mid, min;
        while (true) {
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            confirm(x, y, z);
        }
    }
    public static void confirm(int x, int y, int z) {
        int big, small, middle;
        big = (x>y)&&(x>z)?x:(z>y?z:y);
        small = (y>x)&&(z>x)?x:(y>z?z:y);
        middle = (x>y)?((x>z)?((y>z)?y:z):x):((y>z)?((x>z)?x:z):y);

        if (pow(big,2)==pow(small,2)+pow(middle,2))
            System.out.println("right");
        else
            System.out.println("wrong");
    }
}
