package lsm.level1;

import java.util.Arrays;

public class Lv1_31_K번째수 {

    public class Solution {
        private static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0] - 1;  // 시작 인덱스 (1-based 인덱스를 0-based로 변환)
                int end = commands[i][1];        // 끝 인덱스
                int k = commands[i][2] - 1;      // k번째 수 (1-based 인덱스를 0-based로 변환)

                int[] slicedArray = Arrays.copyOfRange(array, start, end);

                Arrays.sort(slicedArray);

                answer[i] = slicedArray[k];
            }

            return answer;
        }

        public static void main(String[] args) {
            int[] array = {1, 5, 2, 6, 3, 7, 4};
            int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

            System.out.println(Arrays.toString(solution(array,commands)));  // 출력: [5, 6, 3]
        }
    }
}
