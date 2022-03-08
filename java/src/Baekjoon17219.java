import java.io.*;
import java.util.*;

public class Baekjoon17219 {
    public static void main(String args[]) throws IOException {
        int N, M;
        Map<String, String> map = new HashMap();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        for (int j=0; j<M; j++) {
            String value = map.get(br.readLine());
            bw.write(value+"\n");
        }
        bw.flush();
    }
}
