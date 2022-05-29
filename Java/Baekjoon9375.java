import java.util.*;

public class Baekjoon9375 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map;
        String name;
        int i, j, n, sum, T = sc.nextInt();

        for (i=0; i<T; i++) {
            map = new HashMap();
            n = sc.nextInt();
            sum = 1;

            for (j=0; j<n; j++) {
                sc.next();
                name = sc.next();

                if (map.containsKey(name))
                    map.replace(name, map.get(name)+1);
                else
                    map.put(name, 1);
            }

            for (int num:map.values())
                sum *= (num+1);
            System.out.println(sum-1);
        }
    }
}
