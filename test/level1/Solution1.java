package test.level1;

class Solution1 {
	public static void main(String args[]) {
		Solution1 s = new Solution1();
		int[] arr = {1,2,3,4,5};
		System.out.println("solution: "+s.solution(arr));
	}
	
    public double solution(int[] arr) {
        double answer = 0;

        for (int i=0; i<arr.length; i++)
            answer += arr[i];

        answer = answer/arr.length;

        return answer;
    }
}