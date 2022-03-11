import java.util.Scanner;

public class Baekjoon1992 {
    public static boolean confirm(int x, int y, int size) {
        int n = list[x][y];
        for (int i=x; i<x+size; i++)
            for (int j=y; j<y+size; j++)
                if (n!=list[i][j])
                    return false;
        return true;
    }

    public static void count(int x, int y, int size) {
        if (size==1)
            System.out.print(list[x][y]);
        else {
            if (confirm(x, y, size)) {
                System.out.print(list[x][y]);
            }
            else {
                System.out.print("(");
                for (int i=x; i<x+size; i+=size/2)
                    for (int j=y; j<y+size; j+=size/2)
                        count(i, j, size/2);
                System.out.print(")");
            }
        }
    }

    public static int[][] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers;
        int i, j;
        int N=sc.nextInt();
        list = new int[N][N];

        for (i=0; i<N; i++) {
            numbers=sc.next().split("");
            for (j=0; j<N; j++)
                list[i][j]=Integer.parseInt(numbers[j]);
        }

        count(0,0,N);
    }
}
