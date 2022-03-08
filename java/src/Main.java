import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T, k, n;
		String op, input[];
		TreeMap<Integer, Integer> treeMap;
		T = Integer.parseInt(br.readLine());

		for (int i=0; i<T; i++) {
			treeMap = new TreeMap();
			k = Integer.parseInt(br.readLine());
			for (int j=0; j<k; j++) {
				input = br.readLine().split(" ");
				op=input[0];
				n=Integer.parseInt(input[1]);

				if (op.equals("I"))
					treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
				else {
					if(!treeMap.isEmpty())
						if(n == -1) {
							int minKey = treeMap.firstKey();
							if(treeMap.get(minKey) == 1)
								treeMap.remove(minKey);
							else
								treeMap.put(minKey, treeMap.get(minKey) - 1);
						}
						else {
							int maxKey = treeMap.lastKey();
							if(treeMap.get(maxKey) == 1)
								treeMap.remove(maxKey);
							else
								treeMap.put(maxKey, treeMap.get(maxKey) - 1);
						}
				}
			}

			if(treeMap.isEmpty())
				bw.write("EMPTY\n");
			else
				bw.write(treeMap.lastKey() + " " + treeMap.firstKey() + "\n");
		}
		bw.flush();
	}
}