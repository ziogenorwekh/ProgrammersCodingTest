package bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        solution7.solution(null);
    }
}

class Solution7 {

    static int[] mathGUp1 = new int[]{1, 2, 3, 4, 5};
    static int[] mathGUp2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    static int[] mathGUp3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        int[] answer = {};
        int oneAns = 0;
        int twoAns = 0;
        int threeAns = 0;
//        ?A
        for (int i = 0; i < 42; i = i+5) {
            System.out.println("i = " + i);
        }
        return answer;
    }
}
