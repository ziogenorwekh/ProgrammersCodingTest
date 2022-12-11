package stackandqueue;

import java.util.*;
import java.util.stream.Collectors;

public class DonLikeSameNumber {
    public static void main(String[] args) {
    }
}

class Solution1 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        list.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (list.get(j) == arr[i]) {
            } else {
                list.add(arr[i]);
                j++;
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
