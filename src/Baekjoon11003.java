import java.io.*;
import java.util.*;

public class Baekjoon11003 {
    public static void main(String args[]) throws IOException {
        int N, L;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        Deque<int[]> q = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!q.isEmpty() && q.peekLast()[0] > num)
                q.pollLast();

            q.offer(new int[] {num,i});
            if(q.peek()[1] < i -(L-1))
                q.poll();
            bw.write(q.peek()[0]+" ");
        }
        bw.flush();
    }
}
