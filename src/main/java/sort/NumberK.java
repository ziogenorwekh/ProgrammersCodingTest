package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberK {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = solution4.solution(array, commands);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("아이 = " + i);
        }
    }
}

class Solution4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
                Collections.sort(list);
            }
            answer[i] = list.get(commands[i][2] - 1);
            list.clear();
        }
        return answer;
    }
}
