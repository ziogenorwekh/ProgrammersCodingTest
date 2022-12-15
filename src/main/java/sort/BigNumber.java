package sort;

public class BigNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 10, 2};
        Solution5 solution5 = new Solution5();
        solution5.solution(arr);
    }
}
class Solution5 {
    public String solution(int[] numbers) {
        String answer = "";
        int nOC = 1;
        for (int i = 1; i <= numbers.length; i++) {
            nOC *= i;
        }
        int[] result = new int[nOC];

        for (int i = 0; i < nOC; i++) {
            String s = "";

        }
        return answer;
    }
}