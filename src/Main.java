import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		int N, x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PriorityQueue<Integer> maxhip = new PriorityQueue();
		PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());

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
				queue.add(x);
		}
	}
}