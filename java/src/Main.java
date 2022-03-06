import java.util.*;

public class Main {
	public static int N, M;
	public static String pokemon, key;
	public static Map<String,String> map;

	public static void main(String[] args) {
		map=new HashMap();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		for (int i=1;i<=N;i++) {
			pokemon = sc.next();
			map.put(pokemon, String.valueOf(i));
			map.put(String.valueOf(i), pokemon);
		}
		for (int i=0;i<M;i++) {
			key = sc.next();
			System.out.println(map.get(key));
		}
	}
}