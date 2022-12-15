package bruteforce;

public class MinimalRectangle {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[][] size = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        System.out.println(solution6.solution(size));
    }
}

class Solution6 {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        int max = sizes[0][0];
        int max2 = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > max) {
                max = sizes[i][0];
            }
            if (sizes[i][1] > max2) {
                max2 = sizes[i][1];
            }
        }

        return max * max2;
    }
}
