package test.level1;

import java.util.ArrayList;
import java.util.Comparator;

class Solution2 {
	
	public static void main(String args[]) {
		Solution2 s = new Solution2();
		int[] arr = {1,2,3,4,5};
		int[] solution = s.solution(arr);
		System.out.println("solution");
		for (int i : solution)
			System.out.println(i);
	}
    
	public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 0;

        for(int i=0; i<numbers.length; i++) {
            int sum;
            for(int j=i+1; j<numbers.length; j++) {
                sum = numbers[i]+numbers[j];
                if(!list.contains(sum))
                    list.add(sum);
            }
        }
        list.sort(Comparator.naturalOrder());

        answer = new int[list.size()];
        for (int item : list) {
            answer[size++] = item;
        }

        return answer;
    }
}
