import java.util.Scanner;

public class Baekjoon1780 {
    public static int[][] list;
    public static int[] cnt = new int[3];

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
            cnt[list[x][y]+1]++;
        else {
            if (confirm(x, y, size)) {
                cnt[list[x][y]+1]++;
            }
            else {
                for (int i=x; i<x+size; i+=size/3)
                    for (int j=y; j<y+size; j+=size/3) {
                        count(i, j, size/3);
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
        for (i=0; i<3; i++)
            System.out.println(cnt[i]);

    }
}
