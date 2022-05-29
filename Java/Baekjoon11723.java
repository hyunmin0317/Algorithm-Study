import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList();
        int M=Integer.parseInt(br.readLine());
        String op;
        int num;

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            op = st.nextToken();

            if (op.equals("empty")) {
                list.clear();
            } else if (op.equals("all")) {
                list.clear();
                for (int j=1; j<=20; j++)
                    list.add(j);
            } else {
                num = Integer.parseInt(st.nextToken());
                if (op.equals("add")) {
                    if (!list.contains(num))
                        list.add(num);
                } else if (op.equals("remove")) {
                    list.remove(Integer.valueOf(num));
                } else if (op.equals("toggle")) {
                    if (list.contains(num))
                        list.remove(Integer.valueOf(num));
                    else
                        list.add(num);
                } else {
                    if (list.contains(num))
                        bw.write(String.valueOf(1)+"\n");
                    else
                        bw.write(String.valueOf(0)+"\n");
                }
            }
        }
        bw.flush();
    }
}
