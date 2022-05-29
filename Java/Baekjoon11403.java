import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon11403 {
    static int[][] vertex;
    static int N;

    public static void bfs(int i) {
        Queue<Integer> queue = new LinkedList();
        int[] visit = new int[N];
        queue.offer(i);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int j = 0; j < N; j++) {
                if(vertex[temp][j]==1 && visit[j]==0) {
                    visit[j] = 1;
                    queue.offer(j);
                }
            }
        }
        for (int n:visit)
            System.out.print(n+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        vertex = new int[N][N];

        for (int i=0; i<N; i++)
            for (int j=0; j<N; j++)
                vertex[i][j] = sc.nextInt();

        for (int i=0; i<N; i++)
            bfs(i);
    }
}
