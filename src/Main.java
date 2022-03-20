import java.util.*;

public class Main {
	static Deque<Integer> deque;
	static String commands;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			commands = sc.next();
			n = sc.nextInt();
			String arr = sc.next();
			deque = new LinkedList<>();
			for (String s : arr.substring(1, arr.length() - 1).split(","))
				if (!s.equals(""))
					deque.add(Integer.valueOf(s));

			System.out.println(ac());
		}
	}

	public static String ac() {
		boolean reverse = false;

		for (char command : commands.toCharArray()) {
			if (command == 'R')
				reverse = !reverse;
			else {
				if (deque.size() == 0)
					return "error";
				if (reverse)
					deque.removeLast();
				else
					deque.removeFirst();
			}
		}

		StringBuilder sb = new StringBuilder("[");
		while (!deque.isEmpty()) {
			sb.append(reverse ? deque.removeLast() : deque.removeFirst());
			if (deque.size() != 0)
				sb.append(',');
		}
		sb.append(']');

		return sb.toString();
	}
}