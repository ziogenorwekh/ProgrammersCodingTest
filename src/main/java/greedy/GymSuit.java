package greedy;

import java.util.*;

public class GymSuit {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution(9, new int[]{2,3}, new int[]{5,7,9}));
    }
}

class Solution8 {
    public int solution(int n, int[] lost, int[] reserve) {
        // ex n = 9, lost = 3,4,6,8 , reserve 5,7,9
//        수정해야댐
        int answer = n;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = lost.length-1; i >= 0; i--) {
            queue.add(lost[i]);
        }

        for (int i = reserve.length - 1; i >= 0; i--) {
            if (queue.isEmpty()) {
                break;
            }
            Integer poll = queue.poll(); // 8
            System.out.println("poll = " + poll);
            if (reserve[i] + 1 == poll) {
                queue.remove(poll);
            }
            else if (reserve[i] - 1 == poll) {
                queue.remove(poll);
            }
        }
        for (int i = 0; i < queue.size(); i++) {
            System.out.println("queue.poll() = " + queue.poll());
        }
        System.out.println("queue.size() = " + queue.size());
        answer -= queue.size();
        return answer;
    }
}
