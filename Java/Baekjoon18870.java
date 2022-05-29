import java.io.*;
import java.util.*;

public class Baekjoon18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> map = new HashMap();
        int idx, N = Integer.parseInt(br.readLine());
        int[] sort, number = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++)
            number[i] = Integer.parseInt(st.nextToken());
        sort=number.clone();
        Arrays.sort(sort);

        idx=0;
        for (int i:sort)
            if (!map.containsKey(i))
                map.put(i, idx++);

        for (int n:number)
            bw.write(map.get(n)+" ");
        bw.flush();
    }
}
