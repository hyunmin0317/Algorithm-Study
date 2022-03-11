import java.util.*;

public class Baekjoon1389 {
    static Queue<Integer> queue;
    static boolean[][] vertex;
    static boolean[] visit;
    static int[] values;
    static int MAX = 101;
    static int N, M;

    public static int bfs(int i) {
        int sum=0;
        visit[i] = true;
        queue.offer(i);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int j = 1; j <= N; j++) {
                if(vertex[temp][j] && !visit[j]) {
                    visit[j] = true;
                    queue.offer(j);
                    values[j] = values[temp]+1;
                }
            }
        }

        for (var value:values)
            sum += value;
        return sum;
    }

    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int num, ans=0;
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();
        queue = new LinkedList();
        vertex = new boolean[MAX][MAX];

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i=0; i<M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (!numbers.contains(x))
                numbers.add(x);
            if (!numbers.contains(y))
                numbers.add(y);
            vertex[x][y] = vertex[y][x] = true;
        }
        Collections.sort(numbers);

        for (var number:numbers) {
            visit = new boolean[MAX];
            values = new int[MAX];
            num = bfs(number);
            if (min>num) {
                min = num;
                ans = number;
            }
        }
        System.out.println(ans);
    }
}
