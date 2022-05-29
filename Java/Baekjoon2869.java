import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2869 {
    public static void main(String[] args) throws IOException {
        int A, B, V, day;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0)
            day++;

        System.out.println(day);
    }
}
