package stackandqueue;

import java.util.Stack;

public class RightBracket {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
    }
}

class Solution2 {
    boolean solution(String s) {

        if (s.charAt(0) == ')') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }
            Character pop = stack.pop(); // 이전 값
            if (!pop.equals(s.charAt(i))) { // 이전 값과 현재 값 비교
                if (pop.equals(')')) {
                    return false;
                }
            } else { // 다르면
                stack.push(pop); // 같으면 둘 다 넣어
                stack.push(s.charAt(i));
            }
        }

        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}

//        stack.push(s.charAt(0));
//                for (int i = 1; i < s.length(); i++) {
//        if (stack.empty()) {
//        stack.push(s.charAt(i));
//        continue;
//        }
//        Character pop = stack.pop(); // 이전 값
//        if (!pop.equals(s.charAt(i))) { // 이전 값과 현재 값 비교
//        if (pop.equals(')')) {
//        return false;
//        }
//        } else { // 다르면
//        stack.push(pop); // 같으면 둘 다 넣어
//        stack.push(s.charAt(i));
//        }
//        }