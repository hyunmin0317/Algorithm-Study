import java.util.*;

public class Main {
	public static void main(String[] args) {
		int N, M, i;
		String word;
		Scanner sc = new Scanner(System.in);
		HashSet<String> array = new HashSet();
		List<String> list = new ArrayList();

		N=sc.nextInt();
		M=sc.nextInt();

		for (i=0; i<N; i++)
			array.add(sc.next());
		for (i=0; i<M; i++) {
			word = sc.next();
			if (array.contains(word)) {
				list.add(word);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (var w : list)
			System.out.println(w);
	}
}