import java.util.Scanner;

public class Baekjoon2630 {
    public static int[][] list;
    public static int[] cnt = new int[2];

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
            cnt[list[x][y]]++;
        else {
            if (confirm(x, y, size)) {
                cnt[list[x][y]]++;
            }
            else {
                for (int i=x; i<x+size; i+=size/2)
                    for (int j=y; j<y+size; j+=size/2) {
                        count(i, j, size/2);
                    }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int N=sc.nextInt();
        list = new int[N][N];

        for (i=0; i<N; i++)
            for (j=0; j<N; j++)
                list[i][j] = sc.nextInt();

        count(0,0,N);
        for (i=0; i<2; i++)
            System.out.println(cnt[i]);
    }
}
