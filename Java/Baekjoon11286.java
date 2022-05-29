import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

import static java.lang.Math.abs;

public class Baekjoon11286 {
    public static void main(String[] args) throws IOException {
        int N, x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Numbers> queue = new PriorityQueue();

        N=Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            x = Integer.parseInt(br.readLine());

            if (x==0) {
                if (queue.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(queue.poll());
            }
            else
                queue.add(new Numbers(x, abs(x)));
        }
    }
}
