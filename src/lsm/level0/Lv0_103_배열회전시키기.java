package lsm.level0;

import java.util.Arrays;

public class Lv0_103_배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String direction = "left";
        System.out.println(Arrays.toString(solution(numbers,direction)));
    }
    private static int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];

        if (direction.equals("right")) {
            // 오른쪽으로 회전하는 경우
            for (int i = 1; i < n; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[n - 1];
        } else if (direction.equals("left")) {
            // 왼쪽으로 회전하는 경우
            for (int i = 0; i < n - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[n - 1] = numbers[0];
        }

        return answer;
    }
}
